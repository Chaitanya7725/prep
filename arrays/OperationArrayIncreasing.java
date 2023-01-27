package arrays;

import java.util.Arrays;

public class OperationArrayIncreasing {
//    Chaitanya: https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/
    public static void main(String[] args) {
        int[] nums={1,1,1};
        System.out.println(minOperations(nums));
    }

    private static int minOperations(int[] nums) {
        int totalCount=0;
        for (int i = 1; i < nums.length; i++) {
            int count=0;
            if(nums[i]<=nums[i-1]){
                count=nums[i-1]-nums[i]+1;
                nums[i]+=count;
//                System.out.println(count+" "+ Arrays.toString(nums));
                totalCount+=count;
            }
        }
        return totalCount;
    }
}
