package arrays.medium;

import java.util.*;

public class ZigzagConversion {

    public static void main(String[] args) {
        String s="PAYPALISHIRING";
        int numRows=3;
        System.out.println(convert(s,numRows));//PAHNAPLSIIGYIR

        String s1="PAYPALISHIRING";
        int numRows1=4;
        System.out.println(convert(s1,numRows1));//PINALSIGYAHRPI

        String s2="A";
        int numRows2=1;
        System.out.println(convert(s2,numRows2));//A

        String s3="AB";
        int numRows3=1;
        System.out.println(convert(s3,numRows3));//AB

        String s4="AB";
        int numRows4=2;
        System.out.println(convert(s4,numRows4));//AB

    }
    private static String convert(String s, int numRows) {
        if(numRows==1) return s;
        StringBuilder result=new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            int increment=(numRows-1)*2;
            for (int j = i; j < s.length(); j+=increment) {
                result.append(s.charAt(j));
                if(i>0 && i<numRows-1 && (j+increment-2*i)<s.length())
                    result.append(s.charAt(j+increment-2*i));
            }
        }
        return result.toString();
    }

}
