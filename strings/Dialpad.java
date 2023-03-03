package strings;

import java.util.*;

public class Dialpad {

    static Map<Character, String> records = new HashMap<>() {{
        put('2', "abc");put('3', "def");put('4', "ghi");put('5', "jkl");put('6', "mno");put('7', "pqrs");put('8', "tuv");put('9', "wxyz");
    }};

    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }

    private static List<String> letterCombinations(String digits){
        List<String> answer=new ArrayList<>();
        answer.add("");
        for (int i = 0; i < digits.length(); i++)
            answer=getCombinations(answer,records.get(digits.charAt(i)));
        return answer;
    }

    private static List<String> getCombinations(List<String> answer, String charAt) {
        List<String> currentList=new ArrayList<>();
        for (String a:answer)
            for (char c:charAt.toCharArray())
                currentList.add(a+c);
        return currentList;
    }
}

