package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DialpadRecursive {

    static Map<Character, String> records = new HashMap<>() {{
        put('2', "abc");put('3', "def");put('4', "ghi");put('5', "jkl");put('6', "mno");put('7', "pqrs");put('8', "tuv");put('9', "wxyz");
    }};

    static String[] mapping=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        String digits="23";
        System.out.println(letterCombinations(digits));

        String digits1="2345";
        System.out.println(letterCombinations(digits1));
    }

    static List<String> result=null;
    private static List<String> letterCombinations(String digits) {
        result=new ArrayList<>();
        dfs(0,digits,new StringBuilder());
        return result;
    }

    private static void dfs(int length, String digits, StringBuilder temp) {
        if(length==digits.length()){
            result.add(temp.toString());
            return;
        }
        //loop digit present at the length index of digit string:
        char ch=digits.charAt(length);
        String str=mapping[ch-'0'];
        for (char c:str.toCharArray()) {
            temp.append(c);
            dfs(length+1,digits,temp);
            temp.deleteCharAt(temp.length()-1);
        }

    }

}
