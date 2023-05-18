package Utilities;

import java.util.*;

public class MapSortingExample {
    public static void main(String[] args) {
        Map<Integer, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put(1, 25);
        unsortedMap.put(2, 30);
        unsortedMap.put(3, 20);

        Set<Map.Entry<Integer, Integer>> entries = unsortedMap.entrySet();

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(entries);

        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<Integer, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println(sortedMap);
    }
}
