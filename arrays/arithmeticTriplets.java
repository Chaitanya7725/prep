package arrays;

import java.util.HashSet;
import java.util.Set;

public class arithmeticTriplets {
//    https://leetcode.com/problems/number-of-arithmetic-triplets/
    public int arithmeticTriplet(int[] nums, int diff) {
        Set<Integer> set=new HashSet<>();
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]+"-"+diff+"="+(nums[i]-diff)+","+nums[i]+"-"+2*diff+"="+(nums[i]-2*diff));
            if(set.contains(nums[i]-diff) && set.contains(nums[i]-2*diff))
                count++;
            set.add(nums[i]);
            System.out.println(set);
        }
        return count;
    }

    public static void main(String[] args) {
        arithmeticTriplets a = new arithmeticTriplets();
        int[] nums = { 0,1,4,6,7,10};
        int diff = 3;
//        int[] nums = { 4, 5, 6, 7, 8, 9 };
//        int diff = 2;
        int result = a.arithmeticTriplet(nums, diff);
        System.out.println(result);
    }
}