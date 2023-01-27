package arrays;

public class WordswithPrefix {

    public static void main(String[] args) {
        String[] words={"pay","attention","practice","attend"};
        String pref="at";
//        String[] words={"leetcode","win","loops","success"};
//        String pref="code";
        System.out.println(prefixCount(words,pref));
    }

    private static int prefixCount(String[] words, String pref) {
        int count=0;
        for (String word : words) {
            if(word.length()>=pref.length() && word.substring(0,pref.length()).contains(pref))
                count++;
        }
        return count;
    }
}
