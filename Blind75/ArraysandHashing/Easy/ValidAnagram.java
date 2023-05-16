package Blind75.ArraysandHashing.Easy;

public class ValidAnagram {

    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        System.out.println(isAnagram(s , t));

        s="rat";
        t="car";
        System.out.println(isAnagram(s , t));
    }

    private static boolean isAnagram(String s, String t) {
        // https://www.scaler.com/topics/sort-a-string-in-java/
        //Mutable Reduction Operation
        return s.chars().sorted().collect(
                StringBuilder::new,
                StringBuilder::appendCodePoint,
                StringBuilder::append
        ).toString().equals(t.chars().sorted().collect(
                StringBuilder::new,
                StringBuilder::appendCodePoint,
                StringBuilder::append
        ).toString());
    }

}
