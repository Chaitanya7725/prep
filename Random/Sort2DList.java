package Random;

import java.util.*;
public class Sort2DList {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(4, 6));
        list.add(Arrays.asList(4, 5));
        list.add(Arrays.asList(7,8));
        list.add(Arrays.asList(6,9));
        list.add(Arrays.asList(0,1));
        list.add(Arrays.asList(1,2));
        list.add(Arrays.asList(2,3));
        list.add(Arrays.asList(5,6));
        list.add(Arrays.asList(3,4));
        list.add(Arrays.asList(6,7));
        list.add(Arrays.asList(8,9));
        list.add(Arrays.asList(2,5));
        list.add(Arrays.asList(5,8));

        Collections.sort(list, new Comparator<List<Integer>>() {
            public int compare(List<Integer> a, List<Integer> b) {
                if (a.get(0).compareTo(b.get(0)) == 0) {
                    return a.get(1).compareTo(b.get(1));
                }
                return a.get(0).compareTo(b.get(0));
            }
        });

        for (List<Integer> sublist : list) {
            System.out.print(sublist);
        }
    }


}
