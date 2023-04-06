package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class RemoveOuterMostParenthesis {

//    https://leetcode.com/problems/remove-outermost-parentheses/
    public static void main(String[] args) {
        String s="(()())(())";
        System.out.println(removeOuterParentheses(s));
        String s1="(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s1));
        String s2="()()";
        System.out.println(removeOuterParentheses(s2));
    }

    private static String removeOuterParentheses(String s) {

        String result="";

        List<String> preResult= new ArrayList<>();

        Stack<Character> storage=new Stack<>();

        int j=0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==')')
                storage.pop();
            else
                storage.push(s.charAt(i));
            if(storage.size()==0){
                preResult.add(s.substring(j, i+1));
                j=i+1;
            }
        }

        for (int i = 0; i < preResult.size(); i++) {
            if(preResult.get(i).length()>3)
                preResult.set( i,preResult.get(i).substring(0,preResult.get(i).length()));
        }
        for (String str : preResult) {
//            System.out.println(str+" "+str.length()+" "+str.substring(1,str.length()-1));
            result+=str.substring(1,str.length()-1);
        }

        return result;
    }

}
