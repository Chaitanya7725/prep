package strings;

import java.util.*;
import java.util.regex.Pattern;

public class cellsinRangeExcel {

    public static List<String> cellsInRange(String s) {
        /*List<Character> store = new ArrayList<>();
        List<String> output = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        String[] strings = s.split(":");
        for (char i = s.charAt(0); i <= strings[strings.length - 1].charAt(0); i++) {
            store.add(i);
        }
        for (int i = 0; i < strings.length; i++) {
            numbers.add(Integer.valueOf(strings[i].substring(1)));
        }
        System.out.println(numbers.get(0).getClass().getSimpleName());
        for (int i = 0; i < store.size(); i++) {
            int start = numbers.get(0);
            int end = numbers.get(numbers.size() - 1);
            while (start <= end) {
                System.out.println(store.get(i) + "" + start);
                start++;
            }
        }
        return output;*/
        List<String> result= new ArrayList<>();
        Map<Character,Integer> archive=new HashMap<>();
        int j=0;
        for (char i = 'a'; i <= 'z'; i++) {
            archive.put(i,j);
            j++;
        }
        String [] input = s.split(":");
        for (char i = input[0].charAt(0); i <= input[1].charAt(0); i++)
            for (int k = Integer.valueOf(input[0].substring(1)); k <= Integer.valueOf(input[1].substring(1)) ; k++)
                result.add(i+""+k);
        return result;
    }

    public static void main(String[] args) {
//         String s = "K1:L2";
         String s = "A1:F1";
//        String s = "U7:X9";
        List<String> array = cellsInRange(s);
        System.out.println(array);
    }
}
