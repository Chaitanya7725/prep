package strings;

import java.util.HashSet;

public class BrokenKeyboard {

    public static void main(String[] args) {

        String text="hello world";
        String brokenLetters="ad";
        System.out.println(canBeTypedWords(text,brokenLetters));//1

        String text1="leet code";
        String brokenLetters1="lt";
        System.out.println(canBeTypedWords(text1,brokenLetters1));//1

        String text2="leet code";
        String brokenLetters2="e";
        System.out.println(canBeTypedWords(text2,brokenLetters2));//0

    }

    private static int canBeTypedWords(String text, String brokenLetters) {
        int res = 0;
        boolean flag = false;
        HashSet<Character> set = new HashSet<>();
        for(char ch : brokenLetters.toCharArray()) set.add(ch);
        for (char alpha : text.toCharArray()) {
            if(alpha==' '){
                if(!flag)
                    res++;
                flag=false;
            }
            else
                if(set.contains(alpha))
                    flag=true;
        }
        return res += flag == false ? 1 : 0;
    }
}
