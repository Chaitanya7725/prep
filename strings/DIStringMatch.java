package strings;

import java.util.Arrays;

public class DIStringMatch {

    public static void main(String[] args) {
        String s="IDID";
        System.out.println(Arrays.toString(diStringMatch(s)));//[0,4,1,3,2]

        String s1="III";
        System.out.println(Arrays.toString(diStringMatch(s1)));//[0,1,2,3]

        String s2="DDI";
        System.out.println(Arrays.toString(diStringMatch(s2)));//[3,2,0,1]
    }

    private static int[] diStringMatch(String s) {
        int length=s.length();
        int[] result=new int[length+1];
        int low=0;
        int high=length;
        for (int i = 0; i < length; i++)
            result[i] = s.charAt(i)=='I' ? low++ : high--;
        result[length]=high;
        return result;
    }

}
