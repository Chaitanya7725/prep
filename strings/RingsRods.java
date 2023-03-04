package strings;

import java.util.*;

public class RingsRods {

    public static void main(String[] args) {
        String rings="B0B6G0R6R0R6G9";
        System.out.println(countPoints(rings));
    }

    private static int countPoints(String rings) {
        int count=0;
        Map<Integer,Set<Character>> storage=new HashMap<>();
        Set<Character> colorSet = null;
        for (int i = 0; i < rings.length(); i+=2) {
            char color=rings.charAt(i);
            int number=Integer.parseInt(String.valueOf(rings.charAt(i+1)));
            if(storage.get(number)!=null)
                colorSet=storage.get(number);
            else
                colorSet=new HashSet<>();
            colorSet.add(color);
            storage.put(number,colorSet);
        }
        for (int number: storage.keySet()){
            int listSize = storage.get(number).size();
            if( listSize == 3)
                count++;
        }
        return count;
    }
}
