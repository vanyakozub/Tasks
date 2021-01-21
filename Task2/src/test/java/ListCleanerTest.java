import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertFalse;

public class ListCleanerTest{
    List<Integer> list = new ArrayList<Integer>();

    @Before
    public void setUp() throws Exception {
        for(int i = 0; i < 25; i++){
            list.add(i);
        }
        list.add(1);
        list.add(1);
        list.add(1);
    }
    @Test
    public void whenCleanerRemoveSameThreeInRow() {
        ListCleaner.removeSameInRow(list);
        assertFalse(list.contains(1));
    }
    @Test
    public void whenCleanerRemoveSame() {
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        ListCleaner.removeSame(list);
        assertFalse(list.contains(2));
    }
}