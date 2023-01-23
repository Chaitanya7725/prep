package arrays;

import java.util.Arrays;

//https://leetcode.com/problems/shuffle-string/
public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int [] indices = {4,5,6,7,0,2,1,3};
        String shuffled=shuffleString(s,indices);
        System.out.println(shuffled.toString());
    }

    public static String shuffleString(String s, int[] indices){
        char result[] =new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            result[indices[i]]=s.charAt(i);
        }
        return String.valueOf(result);
    }
}
