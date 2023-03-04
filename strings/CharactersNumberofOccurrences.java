package strings;

import java.util.*;

public class CharactersNumberofOccurrences {

    public static void main(String[] args) {
        String s="abacbc";
        System.out.println(areOccurrencesEqual(s));//true
        String s1="aaabb";
        System.out.println(areOccurrencesEqual(s1));//false
        String s2="tveixwaeoezcf";
        System.out.println(areOccurrencesEqual(s2));//false

    }

    private static boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> record=new TreeMap<>();
        for (char alpha : s.toCharArray())
            record.put(alpha,record.getOrDefault(alpha,0)+1);

        int total=record.values().stream().reduce(0, (subtotal, element) -> subtotal + element);

//        https://www.geeksforgeeks.org/sorting-a-hashmap-according-to-values/
        List<Map.Entry<Character, Integer> > list = new LinkedList<>(record.entrySet());
        Collections.sort(list, new Comparator<>() {
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        HashMap<Character, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> aa : list)
            temp.put(aa.getKey(), aa.getValue());

//        System.out.println((int)temp.values().toArray()[0]);
        if((total/record.size())==(int)temp.values().toArray()[0])
            return true;
        return false;
    }

}
