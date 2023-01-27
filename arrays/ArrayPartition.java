package arrays;

import java.util.*;

public class ArrayPartition {

    //Easy and correct one
//    https://leetcode.com/problems/array-partition/
    public static void main(String[] args) {
//        int [] sum={1,4,3,2};
        int [] sum={6,2,6,5,1,2};
        System.out.println(arrayPairSum(sum));
    }

    private static int arrayPairSum(int[] nums) {
        int max=0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i+=2) {
            max+=nums[i];
        }
        return max;
    }

}
