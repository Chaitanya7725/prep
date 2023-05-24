package Blind75.ArraysandHashing.Medium;

import java.util.Arrays;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] nums={100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));//4

        int[] nums1={0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums1));//9

        int[] nums2={9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(longestConsecutive(nums2));//7

        int[] nums3={};
        System.out.println(longestConsecutive(nums3));//
    }

    public static int longestConsecutive(int[] nums) {
        // Chaitanya
        int longest=1;
        int length=1;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]-nums[i-1]==1)
                length++;
            else if(nums[i]!=nums[i-1]){
                longest=Integer.max(longest,length);
                length=1;
            }
        }
        return Integer.max(longest,length);
    }

}
