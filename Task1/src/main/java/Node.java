import java.util.ArrayList;
import java.util.List;

public class Node {
    private List<Node> children;

    public Node() {
        this.children = new ArrayList<Node>();
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public Node getChildAt(int index) {
        return this.children.get(index);
    }

    public void setChildAt(Node child, int index) {
        this.children.add(index, child);
    }

}
