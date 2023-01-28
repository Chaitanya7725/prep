package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndices {

//    https://leetcode.com/problems/find-target-indices-after-sorting-array/
//    Chaitanya
    public static void main(String[] args) {
        int[] nums={1,2,5,2,3};
//        int target=2;
//        int target=3;
        int target=5;
        List<Integer> result=targetIndices(nums,target);
        System.out.println(Arrays.toString(result.toArray()));
    }

    private static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> indices = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target)
                indices.add(i);
        }
        return indices;
    }

}
