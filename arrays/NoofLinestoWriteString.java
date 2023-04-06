package arrays;

import java.util.Arrays;

public class NoofLinestoWriteString {

    static String alpha="abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        int[] widths={10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s="abcdefghijklmnopqrstuvwxyz";
        System.out.println(Arrays.toString(numberOfLines(widths,s)));//[3,60]

        int[] widths1={4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s1="bbbcccdddaaa";
        System.out.println(Arrays.toString(numberOfLines(widths1,s1)));//[2,4]
    }

    private static int[] numberOfLines(int[] widths, String s) {
        int sum=0;
        int lineCount=1;
        for (int i = 0; i < s.length(); i++) {
            if((sum+widths[alpha.indexOf(s.charAt(i))])>100){
                lineCount++;
                sum=0;
            }
            sum+=widths[alpha.indexOf(s.charAt(i))];
        }
        return new int[]{lineCount,sum};
    }
}
