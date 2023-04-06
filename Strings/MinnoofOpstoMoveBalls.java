package strings;

import java.util.Arrays;

public class MinnoofOpstoMoveBalls {

    public static void main(String[] args) {
        String boxes="001011";
        System.out.println(Arrays.toString(minOperations(boxes)));//11 8 5 4 3 4

        String boxes1="110";
        System.out.println(Arrays.toString(minOperations(boxes1)));//[1,1,3]
    }

    private static int[] minOperations(String boxes) {

        int count=0; int ops=0;
        int[] res=new int[boxes.length()];

        for (int i = 0; i < boxes.length(); i++) {
            res[i]+=ops;
            count+=boxes.charAt(i)-'0';
            ops+=count;
        }
        count=0;ops=0;
        for (int i = boxes.length()-1; i >=0 ; i--) {
            res[i]+=ops;
            count+=boxes.charAt(i)-'0';
            ops+=count;
        }
        return res;
    }

}
