package Blind75.TwoPointers.Easy;

public class ValidPalindrome {

    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));

        String s1="0P";
        System.out.println(isPalindrome(s1));
    }

    private static boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        return s.equals(String.valueOf(sb.reverse()));
    }

}
