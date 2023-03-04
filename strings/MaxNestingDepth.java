package strings;

import java.util.Stack;

public class MaxNestingDepth {

//    s consists of digits 0-9 and characters '+', '-', '*', '/', '(', and ')'.
    public static void main(String[] args) {
        String s="(1+(2*3)+((8)/4))+1";//3
        System.out.println(maxDepth(s));
        String s1="(1)+((2))+(((3)))";//3
        System.out.println(maxDepth(s1));
    }

    private static int maxDepth(String s) {
        int count=0;
        Stack<Character> archive=new Stack<>();
        s=s.replaceAll("[+--*/]+","").replaceAll("[0-9]","");
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            char thisChar=s.charAt(i);
            if(thisChar=='(')
                archive.push(thisChar);
            else if (thisChar==')')
                archive.pop();
            if(archive.size()>count)
                count=archive.size();
        }
        return count;
    }

}
