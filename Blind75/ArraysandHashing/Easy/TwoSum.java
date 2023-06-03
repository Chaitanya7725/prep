package Blind75.ArraysandHashing.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(nums, target)));

        int[] nums1={3,2,4};
        int target1=6;
        System.out.println(Arrays.toString(twoSum(nums1, target1)));

        int[] nums2={3,3};
        int target2=6;
        System.out.println(Arrays.toString(twoSum(nums2, target2)));
    }

    private static int[] twoSum(int[] nums, int target) {
        if(nums.length==2) return new int[]{0,1};
        int[]result=new int[2];
        Map<Integer,Integer> check=new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            check.put(nums[i],i);
        for (int i = 0; i < nums.length; i++) {
            if(check.containsKey(target-nums[i]) && check.get(target-nums[i])!=i){
                result[0]=i;
                result[1]=check.get(target-nums[i]);
            }
        }
        return result;

    }

}
