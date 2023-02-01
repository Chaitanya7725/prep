package arrays;

import java.util.Arrays;

public class ArrayEqualPairs {

    public static void main(String[] args) {
        int[] nums={3,2,3,2,2,2};
        System.out.println(divideArray(nums));
        int[] nums1={1,2,3,4};
        System.out.println(divideArray(nums1));
    }

    private static boolean divideArray(int[] nums) {
        boolean status=true;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i+=2) {
            if(nums[i]!=nums[i+1])
                return false;
        }
        return status;
    }


}
