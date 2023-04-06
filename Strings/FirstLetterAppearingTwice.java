package strings;

import java.util.HashMap;
import java.util.Map;

public class FirstLetterAppearingTwice {

    public static void main(String[] args) {
        String s="abccbaacz";
        System.out.println(repeatedCharacter(s));//c

        String s1="abcdd";
        System.out.println(repeatedCharacter(s1));//c

    }

    private static char repeatedCharacter(String s) {
        Map<Character,Integer> record=new HashMap<>();
        for (char alpha : s.toCharArray()) {
            record.put(alpha,record.getOrDefault(alpha,0)+1);
            if(record.get(alpha)==2)
                return alpha;
        }
        return ' ';
    }

}
