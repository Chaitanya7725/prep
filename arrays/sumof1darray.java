package arrays;

import java.util.Arrays;

public class sumof1darray {

//    https://leetcode.com/problems/running-sum-of-1d-array/
     public static void main(String[] args) {
         int[] nums={1,2,3};
         int[] numsres=runningSum(nums);
         for (int i :
                 numsres) {
             System.out.print(i+" ");
         }
     }

     public static int[] runningSum(int[] nums) {
         for (int i = 0; i < nums.length - 1; i++) {
             nums[i + 1] += nums[i];
         }
         return nums;
     }
 }