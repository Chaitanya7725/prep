package Strings;

import java.util.HashMap;
import java.util.Map;

public class NumberCountDigits {

    public static void main(String[] args) {
        String num="1210";
        System.out.println(digitCount(num));
    }

    private static boolean digitCount(String num) {
        Map<Character,Integer> records=new HashMap<>();
        for (int i = 0; i < num.length(); i++)
            records.put(num.charAt(i),records.getOrDefault(num.charAt(i),0)+1);

        for (int i = 0; i < num.length(); i++) {
            int map = records.containsKey(num.charAt(i)) ? records.get(i) : 0;
            System.out.println(i+" "+num.charAt(i)+" "+map);
//            if( records.get(num.charAt(i))==Integer.valueOf(String.valueOf(num.charAt(i)))) {
//                return false;
//            }
        }
        System.out.println(records);
        return true;
    }

}
