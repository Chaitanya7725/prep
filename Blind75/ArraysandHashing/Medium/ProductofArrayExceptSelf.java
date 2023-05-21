package Blind75.ArraysandHashing.Medium;

import java.util.Arrays;

public class ProductofArrayExceptSelf {

    public static void main(String[] args) {
//        int[] nums={1,2,3,4};
//        System.out.println(Arrays.toString(productExceptSelf(nums)));//[24,12,8,6]

        int[] nums1={-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums1)));//[0,0,9,0,0]
    }

    private static int[] productExceptSelf(int[] nums) {
        int [] prefix=new int[nums.length];
        int [] postfix=new int[nums.length];
        int [] result=new int[nums.length];

        Arrays.fill(prefix, 1);
        Arrays.fill(postfix, 1);
        Arrays.fill(result, 1);

        int prefixone=1;
        int postfixone=1;

        for (int i = 0; i < nums.length; i++)
            prefix[i] = i==0 ? nums[i] : prefix[i-1] * nums[i];

        for (int i = nums.length-1; i >= 0; i--)
            postfix[i] = i == nums.length-1 ? nums[i] : postfix[i+1] * nums[i];

        for (int i = 0; i < result.length; i++)
            if(i==0)
                result[i] = prefixone * postfix[i+1];
            else if(i==result.length-1)
                result[i] = postfixone * prefix[i-1];
            else
                result[i] = prefix[i-1] * postfix[i+1];
        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(postfix));
        return result;
    }

}
