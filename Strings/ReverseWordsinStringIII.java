package strings;

import java.util.Arrays;
import java.util.Stack;

public class ReverseWordsinStringIII {

    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {
        String result="";
        StringBuilder sb=new StringBuilder();
        String [] splited=s.split(" ");
        for (int i = 0; i < splited.length; i++) {
            splited[i]=sb.append(splited[i]).reverse().toString();
            sb.setLength(0);
        }
        for (int i = 0; i < splited.length; i++) {
            if(i < splited.length-1)
                result+=splited[i]+" ";
            else
                result+=splited[i];
        }
        return result;
    }

}
