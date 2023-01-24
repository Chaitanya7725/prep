package arrays;

import java.util.*;

public class SortPeople {
//    https://leetcode.com/problems/sort-the-people/description/
    public static void main(String[] args) {

        String[] names={"Mary","John","Emma"};
        int[] heights={180,165,170};
        String [] name=sortPeople(names,heights);
        System.out.println(Arrays.toString(name));
    }

    private static String[] sortPeople(String[] names, int[] heights) {
        String[] people=new String[names.length];
        SortedMap<Integer,String> records=new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < names.length; i++)
            records.put(heights[i],names[i]);
        int i=0;
        for (Integer height : records.keySet()) {
            people[i]=records.get(height);
            i++;
        }
        return people;
    }
}
