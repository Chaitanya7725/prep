package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class jewelsStones {

    //https://leetcode.com/problems/jewels-and-stones/

    public static int numJewelsInStones(String jewels, String stones) {
        // Approach 1
//        int counter = 0;
//        for (int i = 0; i < jewels.length(); i++) {
//            int index = stones.indexOf(String.valueOf(jewels.charAt(i)));
//            while (index != -1) {
//                counter++;
//                index = stones.indexOf(String.valueOf(jewels.charAt(i)), index + 1);
//            }
//        }
//        return counter;

        // Approach 2
        int counter = 0;
        List<Character> records=new ArrayList<>();
        for (Character character : jewels.toCharArray())
            records.add(character);

        for (int i = 0; i < stones.length(); i++) {
            if(records.contains(stones.charAt(i)))
                counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));

        String jewels1 = "z";
        String stones1 = "ZZ";
        System.out.println(numJewelsInStones(jewels1, stones1));

    }
}