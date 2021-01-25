import java.util.*;

public class ListCleaner {
    public static void removeSame(List<Integer> list) {
        List<Integer> toRemove = new ArrayList<Integer>();
        HashMap<Integer, List<Integer>> repeats = new HashMap<Integer, List<Integer>>();
        Iterator<Integer> it1 = list.iterator();
        while (it1.hasNext()) {
            Integer val = it1.next();
            if (!repeats.containsKey(val)) {
                repeats.put(val, new ArrayList<Integer>());
            }
            repeats.get(val).add(val);
            if (repeats.get(val).size() >= 3) {
                toRemove.addAll(repeats.get(val));
            }
        }
        list.removeAll(toRemove);
    }

    public static void removeSameInRow(List<Integer> list) {
        List<Integer> toRemove = new ArrayList<Integer>();
        List<Integer> subRow = new ArrayList<Integer>();
        HashMap<Integer, List<Integer>> repeats = new HashMap<Integer, List<Integer>>();
        Iterator<Integer> it1 = list.iterator();
        while (it1.hasNext()) {
            Integer val = it1.next();
            if(subRow.size() !=3){
                subRow.add(val);
            }
            else {
                subRow.set(0,subRow.get(1));
                subRow.set(1,subRow.get(2));
                subRow.set(2, val);
            }
            if (!repeats.containsKey(val)) {
                repeats.put(val, new ArrayList<Integer>());
            }
            repeats.get(val).add(val);
            if (subRow.size() == 3 &&subRow.get(0).equals(subRow.get(1)) && subRow.get(0).equals(subRow.get(2))) {
                toRemove.addAll(repeats.get(val));
            }
        }
        list.removeAll(toRemove);
    }
}
