package arrays;

import java.util.Arrays;

public class HeightChecker {

    public static void main(String[] args) {
//        Chaitanya
        int []heights = {1,1,4,2,1,3};//3
        System.out.println(heightChecker(heights));
        int []heights2 = {5,1,2,3,4};//5
        System.out.println(heightChecker(heights2));
        int []heights3 = {1,2,3,4,5};//0
        System.out.println(heightChecker(heights3));
    }

    private static int heightChecker(int[] heights) {
        int count=0;
        int[] sortedHeight=heights.clone();
        Arrays.sort(sortedHeight);
        for (int i = 0; i < sortedHeight.length; i++) {
            if(sortedHeight[i]!=heights[i])
                count++;
        }
        return count;
    }


}
