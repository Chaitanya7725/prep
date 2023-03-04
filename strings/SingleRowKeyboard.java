package strings;

import java.util.HashMap;
import java.util.Map;

public class SingleRowKeyboard {

    public static void main(String[] args) {

        String keyboard="abcdefghijklmnopqrstuvwxyz";
        String word="cba";
        System.out.println(calculateTime(keyboard,word));
        String keyboard1="pqrstuvwxyzabcdefghijklmno";
        String word1="leetcode";
        System.out.println(calculateTime(keyboard1,word1));
    }

    private static int calculateTime(String keyboard, String word) {
        int count=0;
        int temp=0;
        Map<Character,Integer> archive=new HashMap<>();
        for (int i = 0; i < 26; i++)
            archive.put(keyboard.charAt(i),i);
        for (int i = 0; i < word.length(); i++) {
            int diff=Math.abs(archive.get(word.charAt(i))-temp);
            temp=archive.get(word.charAt(i));
            count+=diff;
        }
        return count;
    }
}
