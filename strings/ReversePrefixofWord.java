package strings;

public class ReversePrefixofWord {

    public static void main(String[] args) {
        String word="abcdefd";
        char ch='d';
        System.out.println(reversePrefix(word,ch));

        String word1="xyxzxe";
        char ch1='z';
        System.out.println(reversePrefix(word1,ch1));

        String word2="abcd";
        char ch2='z';
        System.out.println(reversePrefix(word2,ch2));
    }

    private static String reversePrefix(String word, char ch) {
        int index=word.indexOf(ch);
        StringBuilder string = new StringBuilder(word);
        if(word.contains(String.valueOf(ch))){
            for (int i = 0; i <= index/2; i++) {
                char temp=word.charAt(i);
                string.setCharAt(i,word.charAt(index-i));
                string.setCharAt(index-i,temp);
            }
            return string.toString();
        }
        return word;
    }

}
