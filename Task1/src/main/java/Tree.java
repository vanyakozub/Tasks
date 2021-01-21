public class Tree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public int calculateHeight(Node root) {
        if(root == null) {
            return 0;
        }
        return Math.max(calculateHeight(root.getLeftNode()), calculateHeight(root.getRightNode()) + 1);

    }
}
