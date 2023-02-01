package arrays;

public class CountPrefixes {

//    https://leetcode.com/problems/count-prefixes-of-a-given-string/
    public static void main(String[] args) {

        String[] words={"a","b","c","ab","bc","abc"};
        String s="abc";
        System.out.println(countPrefixes(words,s));

        String[] words1={"a","a"};
        String s1="aa";
        System.out.println(countPrefixes(words1,s1));

    }

    private static int countPrefixes(String[] words, String s) {
        int count=0;
        for (String word : words) {
            if(s.indexOf(word)==0)
                count++;
        }
        return count;
    }
}
