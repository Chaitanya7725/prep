package arrays;

public class EquivalentStringArray {
//    https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
    public static void main(String[] args) {
        String [] word1={"ab", "c"};
        String [] word2 = {"a", "bc"};
        System.out.println(checkEquivalentString(word1,word2));
    }

    private static boolean checkEquivalentString(String[] word1, String[] word2) {

        String string1 = String.join("", word1);
        String string2 = String.join("", word2);

        return string1.equalsIgnoreCase(string2);
    }


}
