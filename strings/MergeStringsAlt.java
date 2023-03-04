package strings;

public class MergeStringsAlt {

    public static void main(String[] args) {
        String word1="abc";
        String word2="pqr";
        System.out.println(mergeAlternately(word1,word2));//apbqcr

        String word3="ab";
        String word4="pqrs";
        System.out.println(mergeAlternately(word3,word4));//apbqrs

        String word5="abcd";
        String word6="pq";
        System.out.println(mergeAlternately(word5,word6));//apbqcr
    }

    private static String mergeAlternately(String word1, String word2) {
        String result="";
        int length1=word1.length();
        int length2=word2.length();
        String c1;
        String c2;
        for (int i = 0; i < Integer.max(length1,length2); i++) {
            c1 = i < length1 ? String.valueOf(word1.charAt(i)):"";
            c2 = i < length2 ? String.valueOf(word2.charAt(i)):"";
            result+=c1;
            result+=c2;
        }
        return result;
    }

}
