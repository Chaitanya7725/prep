package arrays;

public class FirstPalindromicString {

//    Chaitanya: https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
//    Used String Builder to reverse the string.
    public static void main(String[] args) {
//        String[] words={"abc","car","ada","racecar","cool"};
//        String[] words={"notapalindrome","racecar"};
        String[] words={"def","ghi"};
        System.out.println(firstPalindrome(words));
    }

    private static String firstPalindrome(String[] words) {
        StringBuilder sbuilder = new StringBuilder();
        String outputPalindrome="";
        for (String word :words) {
            if(word.length()%2==0)
                sbuilder.append(word.substring(word.length()/2));
            else if(word.length()%2==1)
                sbuilder.append(word.substring(word.length()/2+1));
            sbuilder.reverse();
//            System.out.println(word.substring(0,word.length()/2).getClass().getSimpleName()+" "+input1.getClass().getSimpleName());
            if( word.substring(0,word.length()/2).equals(sbuilder.toString())){
                outputPalindrome=word;
                break;
            }
            sbuilder.setLength(0);
        }
        return outputPalindrome;
    }

}
