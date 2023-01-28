package arrays;

import java.util.Arrays;

public class GCD {

//    https://leetcode.com/problems/find-greatest-common-divisor-of-array/
//    Chaitanya:
    public static void main(String[] args) {
        int[] nums={2,5,6,9,10};
//        int[] nums={7,5,6,8,3};
//        int[] nums={3,3};
        System.out.println(findGCD(nums));
    }

    private static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int x = nums[0], y = nums[nums.length-1], gcd = 1;
        for(int i = 1; i <= x && i <= y; i++)
            if(x%i==0 && y%i==0)
                gcd = i;
        return gcd;
    }
}
