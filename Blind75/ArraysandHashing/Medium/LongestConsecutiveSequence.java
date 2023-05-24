package Blind75.ArraysandHashing.Medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] nums={100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));

        int[] nums1={0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums1));

        int[] nums2={9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(longestConsecutive(nums2));//7
    }

    public static int longestConsecutive(int[] nums) {
        // Chaitanya
        // this code is to convert int to Integer []
        Integer[] integerArray = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++)
            integerArray[i] = Integer.valueOf(nums[i]);
        Set<Integer> numbersSet = new HashSet<>(Arrays.asList(integerArray));
        int length;
        int longest=0;
        // this deals with the longest sequence
        for (int i = 0; i < nums.length; i++)
            if(!numbersSet.contains(nums[i]-1)){
                length=0;
                while(numbersSet.contains(nums[i]+length))
                    length++;
                longest=Math.max(length,longest);
            }
        return longest;
    }

}
