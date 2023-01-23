package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//https://leetcode.com/problems/unique-number-of-occurrences/
public class uniqueNoofOccurences {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        Set<Integer> check=new HashSet<>(map.values());
        return map.size()==check.size();
    }

    public static void main(String[] args) {
        uniqueNoofOccurences u = new uniqueNoofOccurences();
//        int[] arr = { 1, 2, 2, 1, 1, 3 };// unique
         int[] arr = { 1, 2 };// not
//         int[] arr = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };// unique
        System.out.println(u.uniqueOccurrences(arr));
    }
}
