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
    public void setUp(){
        root.setChildAt(child11, 0);
        root.setChildAt(child12, 1);
        root.getChildAt(0).setChildAt(child21, 0);
        root.getChildAt(0).setChildAt(child22, 1);
        root.getChildAt(1).setChildAt(child23, 0);
        root.getChildAt(0).setChildAt(child24, 2);
        Node child33 = new Node();
        root.getChildAt(0).getChildAt(2).setChildAt(child33, 0);
        Node child41 = new Node();
        child33.setChildAt(child41,0);
    }

    @Test
    public void whenGivenRootCalculateHeight() {
        assertEquals(5, tree.getHeight(root));
    }

    @Test
    public void whenGivenNodeCalculateHeight() {
        assertEquals(3, tree.getHeight(child24));
    }

    @Test
    public void whenGivenZeroCalculateHeight() {
        assertEquals(0, tree.getHeight(null));
    }
}

