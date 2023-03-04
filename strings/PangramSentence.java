package strings;

import java.util.HashMap;
import java.util.Map;

public class PangramSentence {

    public static void main(String[] args) {
        String sentence="thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));

        String sentence1="leetcode";
        System.out.println(checkIfPangram(sentence1));
    }

    private static boolean checkIfPangram(String sentence) {
        boolean status=false;
        Map<Character,Integer> archive=new HashMap<>();
        for (char alphabet : sentence.toCharArray())
            archive.put(alphabet,archive.getOrDefault(alphabet,0)+1);
        if(archive.keySet().size()==26)
            return true;
        return status;
    }


}
