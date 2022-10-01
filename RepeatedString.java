import java.util.ArrayList;
import java.util.List;

/**
 * RepeatedString
 */
public class RepeatedString {

    // https://www.hackerrank.com/challenges/repeated-string/problem?isFullScreen=true
    public static long repeatedString(String s, long n) {
        // long incrementsize = s.length();
        // System.out.println(n);
        // if (n < incrementsize) {
        // incrementsize = n;
        // }
        // List<Integer> array = new ArrayList<>();
        // for (int i = 0; i < incrementsize; i++) {
        // if (s.charAt(i) == 'a') {
        // array.add(i);
        // }
        // }
        // if (s.length() == 1 && s.charAt(0) == 'a') {
        // return n;
        // }

        // for (int i = 0; i < array.size(); i++) {
        // int add = array.get(i) + (int) incrementsize;
        // if (add < n) {
        // array.add(add);
        // } else {
        // break;
        // }
        // }
        // return array.size();

        long multiplier = 0;
        long length = s.length();
        long firsthalf = 0;
        if (length == 1 && s.charAt(0) == 'a') {
            return n;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                multiplier++;
            }
        }
        long divisor = (n) / length;
        if (multiplier > 0)
            firsthalf = multiplier * divisor;

        long reminder = n % length;
        if (reminder > 0) {
            long start = length * divisor;
            long end = (start + reminder) - 1;
            for (long i = start; i <= end; i++) {
                int rem = (int) ((i) % length);
                if (s.charAt(rem) == 'a') {
                    firsthalf++;
                }
            }
        }
        return firsthalf;
    }

    public static void main(String[] args) {
        // String s = "xcz";
        // long n = 711560125001L;
        // String s = "aab";
        // int n = 882787;// 588525
        // String s = "aba";
        // int n = 10; //7
        // String s = "aba";
        // int n = 10; // 7
        // String s = "ceebbcb";
        // int n = 817723; // 0
        // String s = "b";
        // int n = 10000; // 10000
        // String s = "jdiacikk";
        // int n = 899491; // 112436
        // String s = "ababa";
        // int n = 3;// 2
        // String s = "x";
        // int n = 970770;
        // String s =
        // "aadcdaccacabdaabadadaabacdcbcacabbbadbdadacbdadaccbbadbdcadbdcacacbcacddbcbbbaaccbaddcabaacbcaabbaaa";
        // long n = 942885108885L;
        String s = "cfimaakj";
        long n = 554045874191L;
        long a = repeatedString(s, n);
        System.out.println(a);
    }
}