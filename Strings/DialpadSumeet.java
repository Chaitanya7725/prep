package Strings;

import java.util.ArrayList;
import java.util.List;

public class DialpadSumeet {

    public static void main(String[] args) {
        String digits="23";
        System.out.println(letterCombinations(digits));
    }

    private static List<String> letterCombinations(String digits){
        List<String> ans = new ArrayList<>();
        if(digits==null||digits.length()==0) return ans;
        char[][] map = new char[10][];
        map[0]="".toCharArray();
        map[1]="".toCharArray();
        map[2]="abc".toCharArray();
        map[3]="def".toCharArray();
        map[4]="ghi".toCharArray();
        map[5]="jkl".toCharArray();
        map[6]="mno".toCharArray();
        map[7]="pqrs".toCharArray();
        map[8]="tuv".toCharArray();
        map[9]="wxyz".toCharArray();

        ans.add("");
        for(char c:digits.toCharArray())
            ans=expand(ans,map[Integer.parseInt(String.valueOf(c))]);
        return ans;
    }
    private static List<String> expand(List<String> ans,char[] arr)
    {
        List<String> next = new ArrayList<>();
        for(String s:ans)
            for(char c:arr)
                next.add(s+c);
        return next;
    }

}
