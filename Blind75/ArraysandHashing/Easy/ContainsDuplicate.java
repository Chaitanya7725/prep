package Blind75.ArraysandHashing.Easy;

import java.util.Arrays;

public class ContainsDuplicate {

    public static void main(String[] args) {
//        https://leetcode.com/problems/contains-duplicate/submissions/950864182/
        int[] nums={1,2,3,1};
        System.out.println(containsDuplicate(nums));

        int[] nums1={1,2,3,4};
        System.out.println(containsDuplicate(nums1));

        int[] nums2={1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums2));

        //4th test case is large please see it in the submission link
    }

    private static boolean containsDuplicate(int[] nums) {

        // Chaitanya: Doesn't work with large inputs: Time exceeded error
        /*Map<Integer,Integer> check=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            check.put(nums[i],check.getOrDefault(nums[i],0)+1);
            if(check.containsValue(2))
                return true;
        }
        return false;*/

        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])
                return true;
        }
        return false;
    }

}
