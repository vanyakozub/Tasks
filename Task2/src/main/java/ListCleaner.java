import java.util.*;
public class ListCleaner {
    public static void removeSame(List<Integer> list) {
        List<Integer> toRemove = new ArrayList<Integer>();
        List<Integer> repeat = new ArrayList<Integer>();
        Iterator<Integer> it1 = list.iterator();
        while (it1.hasNext()) {
            Integer val = it1.next();
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                Integer curValue = it2.next();
                if(val.equals(curValue)) {
                    repeat.add(curValue);
                }
            }
            if(repeat.size() >= 3) {
                toRemove.addAll(repeat);
            }
            repeat.clear();
        }
        list.removeAll(toRemove);
    }
    public static void removeSameInRow(List<Integer> list) {
        List<Integer> toRemove = new ArrayList<Integer>();
        List<Integer> repeat = new ArrayList<Integer>();
        Iterator<Integer> it1 = list.iterator();
        while (it1.hasNext()) {
            boolean needToRemove = false;
            Integer val = it1.next();
            int amount = 0;
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                Integer curValue = it2.next();
                if(val.equals(curValue)) {
                    repeat.add(curValue);
                    amount++;
                    if(amount >=3) {
                        needToRemove = true;
                    }
                }
                else {
                    amount = 0;
                }
            }
            if(needToRemove) {
                toRemove.addAll(repeat);
            }
            repeat.clear();
        }
        list.removeAll(toRemove);
    }
}
