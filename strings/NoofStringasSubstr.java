package strings;

public class NoofStringasSubstr {

    public static void main(String[] args) {
        String[] patterns={"a","abc","bc","d"};
        String word="abc";
        System.out.println(numOfStrings(patterns,word));

        String[] patterns1={"a","b","c"};
        String word1="aaaaabbbbb";
        System.out.println(numOfStrings(patterns1,word1));

        String[] patterns2={"a","a","a"};
        String word2="ab";
        System.out.println(numOfStrings(patterns2,word2));

    }

    private static int numOfStrings(String[] patterns, String word) {
        int count=0;
        for (String pattern : patterns) {
            if(word.contains(pattern))
                count++;
        }
        return count;
    }
}
