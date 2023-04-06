package strings;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        reverseString(s);
    }

    private static void reverseString(char[] s) {
        char temp;
        int len=s.length-1;
        for (int i = 0; i< s.length/2 ; i++) {
            temp=s[i];
            s[i]=s[len-i];
            s[len-i]=temp;
        }
    }

}
