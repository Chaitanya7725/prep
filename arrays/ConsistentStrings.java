package arrays;

import java.util.Arrays;

public class ConsistentStrings {
//    https://leetcode.com/problems/count-the-number-of-consistent-strings/
    //Work on the allowed char setting the boolean value in an array. and then check for allowed words with that array
    //decrementing the count if character's boolean value is not expected
    public static void main(String[] args) {
        String allowed="ab";//2
        String[] words={"ad","bd","aaab","baa","badab"};
        int result=countConsistentStrings(allowed,words);
        System.out.println(result);

        allowed="abc";//7
        String[] words1={"a","b","c","ab","ac","bc","abc"};
        result=countConsistentStrings(allowed,words1);
        System.out.println(result);

        allowed="cad";//4
        String[] words2={"cc","acd","b","ba","bac","bad","ac","d"};
        result=countConsistentStrings(allowed,words2);
        System.out.println(result);
    }
    private static int countConsistentStrings(String allowed, String[] words) {
        int count=words.length;
        boolean [] alpha=new boolean[26];
        for (char c : allowed.toCharArray()) {
            alpha[c-'a']=true;
        }
        for (String word : words) {
            for (char c : word.toCharArray()) {
                if(alpha[c-'a']==false){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
