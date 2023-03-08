package strings.easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public static void main(String[] args) {
        //ransomnote from magazine
        String ransomNote="a";
        String magazine="b";
        System.out.println(canConstruct(ransomNote,magazine));//false

        String ransomNote1="aa";
        String magazine1="ab";
        System.out.println(canConstruct(ransomNote1,magazine1));//false

        String ransomNote2="aa";
        String magazine2="aab";
        System.out.println(canConstruct(ransomNote2,magazine2));//true

        String ransomNote3="a";
        String magazine3="";
        System.out.println(canConstruct(ransomNote3,magazine3));//true
    }


    private static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> rnote=new HashMap<>();
        Map<Character,Integer> mnote=new HashMap<>();
        for (char ransom:ransomNote.toCharArray())
            rnote.put(ransom,rnote.getOrDefault(ransom,0)+1);
        for (char mag:magazine.toCharArray())
            mnote.put(mag,mnote.getOrDefault(mag,0)+1);
        for (char keys:rnote.keySet())
            if(!mnote.containsKey(keys) || mnote.get(keys)<rnote.get(keys))
                return false;
        return true;
    }
}
