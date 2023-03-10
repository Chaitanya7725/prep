package arrays.easy;

import java.util.Arrays;

public class ApplyOperations {

    // https://www.geeksforgeeks.org/move-zeroes-end-array/
    public static void main(String[] args) {
        int[] nums={1,0,2,0,0,1};
        System.out.println(Arrays.toString(applyOperations(nums)));
        int[] nums1={1,2,2,1,1,0};
        System.out.println(Arrays.toString(applyOperations(nums1)));
        int[] nums2={0,1};
        System.out.println(Arrays.toString(applyOperations(nums2)));
    }

    private static int[] applyOperations(int[] nums) {
        for (int i = 1; i < nums.length; i++)
            if(nums[i]==nums[i-1]){
                nums[i-1]*=2;
                nums[i]=0;
            }
        pushZerosToEnd(nums, nums.length);
        return nums;
    }

    private static void pushZerosToEnd(int[] nums, int n) {
        int count = 0;
        for (int i = 0; i < n; i++)
            if (nums[i] != 0)
                nums[count++] = nums[i];
        while (count < n)
            nums[count++] = 0;

    }

}
