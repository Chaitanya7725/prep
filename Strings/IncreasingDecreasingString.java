package strings;

import java.util.Arrays;

public class IncreasingDecreasingString {

    public static void main(String[] args) {

        String s="aaaabbbbcccc";
        System.out.println(sortString(s));

        String s1="rat";
        System.out.println(sortString(s1));

        String s2="adbac";
        System.out.println(sortString(s2));

    }

    private static String sortString(String s) {
        int length=s.length();
        int[] frequency=new int[26];
        for (int i = 0; i < length; i++) {
            frequency[s.charAt(i) - 'a']++;
        }
        StringBuilder sb=new StringBuilder();
        while(length>0){
            for (int i = 0; i < frequency.length; i++) {
                if(frequency[i]!=0){
                    sb.append((char)(i+97));
                    length--;
                    frequency[i]--;
                }
            }
            for (int i = frequency.length-1; i >=0 ; i--) {
                if(frequency[i]!=0){
                    sb.append((char)(i+97));
                    length--;
                    frequency[i]--;
                }
            }
        }
        return sb.toString();
    }

}
