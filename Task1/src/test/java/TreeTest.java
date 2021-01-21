import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TreeTest {
    Tree tree = new Tree();
    Node root = new Node();
    Node child11 = new Node();
    Node child12 = new Node();
    Node child21 = new Node();
    Node child22 = new Node();
    Node child23 = new Node();
    Node child24 = new Node();

    @Before
    public void setUp() throws Exception {
        root.setLeftNode(child11);
        root.setRightNode(child12);
        root.getLeftNode().setLeftNode(child21);
        root.getLeftNode().setRightNode(child22);
        root.getRightNode().setLeftNode(child23);
        root.getRightNode().setRightNode(child24);
        Node child33 = new Node();
        root.getRightNode().getRightNode().setRightNode(child33);
    }

    @Test
    public void whenGivenRootCalculateHeight() {
        assertEquals(4, tree.calculateHeight(root));
        ;
    }

    @Test
    public void whenGivenNodeCalculateHeight() {
        assertEquals(2, tree.calculateHeight(child11));
        ;
    }

    @Test
    public void whenGivenZeroCalculateHeight() {
        assertEquals(0, tree.calculateHeight(null));
        ;
    }
}

