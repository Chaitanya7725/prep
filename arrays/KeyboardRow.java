package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class KeyboardRow {

    static String[] archive={"qwertyuiopQWERTYUIOP","asdfghjklASDFGHJKL","zxcvbnmZXCVBNM"};
    public static void main(String[] args) {
        String[] words={"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }

    private static String[] findWords(String[] words) {
        List<String> result=new ArrayList<>();
        HashSet<Character> upperRow=new HashSet<>();
        HashSet<Character> middleRow=new HashSet<>();
        HashSet<Character> bottomRow=new HashSet<>();
        for (int i = 0; i < archive[0].length(); i++)
            upperRow.add(archive[0].charAt(i));
        for (int i = 0; i < archive[1].length(); i++)
            middleRow.add(archive[1].charAt(i));
        for (int i = 0; i < archive[2].length(); i++)
            bottomRow.add(archive[2].charAt(i));

        for (int i = 0; i < words.length; i++) {
            int upperRowCount=0,middleRowCount=0,bottomRowCount=0;
            for (int j = 0; j < words[i].length(); j++) {
                if(upperRow.contains(words[i].charAt(j)))
                    upperRowCount++;
                else if(middleRow.contains(words[i].charAt(j)))
                    middleRowCount++;
                else if(bottomRow.contains(words[i].charAt(j)))
                    bottomRowCount++;
            }
            if(upperRowCount== words[i].length() || middleRowCount== words[i].length() || bottomRowCount== words[i].length())
                result.add(words[i]);
        }
        return result.toArray(new String[result.size()]);
    }
}
