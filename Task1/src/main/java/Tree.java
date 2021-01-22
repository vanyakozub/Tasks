import java.util.List;

public class Tree {
    private Node root;
    int curHeight = 0;
    int height = 0;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
    public int calculateHeight(List<Node> children) {
        if(children.isEmpty()){
            if(curHeight >= height) {
                height = curHeight;
                return height;
            }
        }
        curHeight++;
        for(Node curNode:children) {
           calculateHeight(curNode.getChildren());
        }
        curHeight--;
        return height;
    }

    public int getHeight(Node root) {
        if(root == null) {
            return 0;
        }
        return calculateHeight(root.getChildren()) + 1;
    }
}
