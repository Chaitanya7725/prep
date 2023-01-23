package arrays;

import java.util.HashMap;

/**
 * two_sums
 * leetcode url: https://leetcode.com/problems/two-sum/
 */
public class TwoSums {

    public int[] helper(int[] nums, int target) {
        int[] output = { 0, 1 };
        if (nums.length == 2)
            return output;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            map.put(nums[i],i);
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i]) && map.get(target-nums[i])!=i){
                output[0]=i;
                output[1]=map.get(target-nums[i]);
                return output;
            }
        }
        return output;
    }

    public static void main(String[] args) {
//         int[] arr = { 2, 11, 7, 15 };
//         int target = 9;

        int[] arr = { 3, 2, 4 };
        int target = 6;

//         int[] arr = { 3, 1, 3 };
//         int target = 6;

        TwoSums twoSums = new TwoSums();
        for (int i : twoSums.helper(arr, target)) {
            System.out.print(i + " ");
        }
    }
}