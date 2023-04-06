package HashTable;

import java.util.*;

public class SentenceSimilarity {

    public static void main(String[] args) {
        String[] sentence1={"great","acting","skills"};
        String[] sentence2={"fine","drama","talent"};
        List<List<String>> similarPairs=new ArrayList<>(){{
            add(Arrays.asList("great","fine"));
            add(Arrays.asList("drama","acting"));
            add(Arrays.asList("skills","talent"));
        }};
        System.out.println(areSentencesSimilar(sentence1, sentence2,similarPairs));//true
    }

    private static boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < similarPairs.size(); i++) {
            sb.append(similarPairs.get(i).get(0)+" ");
            sb.append(similarPairs.get(i).get(1)+" ");
        }
        System.out.println(sb);
        if(sentence1.length!=sentence2.length)
            return false;
        else
            for (int i = 0; i < sentence1.length; i++)
                System.out.println(Math.abs(sb.indexOf(sentence1[i])-sb.indexOf(sentence2[i])));
//                if(sentence1[i]!=sentence2[i] || Math.abs(sb.indexOf(sentence1[i])-sb.indexOf(sentence2[i]))!=1)
//                    return false;
        return true;
    }

}
