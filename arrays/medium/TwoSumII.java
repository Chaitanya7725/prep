package arrays.medium;

import java.util.Arrays;

public class TwoSumII {

    public static void main(String[] args) {

        int[] nums=new int[]{2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(nums, target)));

        int[] nums1=new int[]{2,3,4};
        int target1=6;
        System.out.println(Arrays.toString(twoSum(nums1, target1)));

    }
    private static int[] twoSum(int[] nums, int target) {
        // Chaitanya
        if(nums.length==2) return new int[]{1,2};
        int[] result = new int[2];

        int left=0;
        int right=nums.length-1;

        while(left < right){
            int sum=nums[left]+nums[right];
            if(sum < target)
                left++;
            else if(sum > target)
                right--;
            else
                return new int[]{left+1,right+1};
        }
        return new int[]{};
    }


}
