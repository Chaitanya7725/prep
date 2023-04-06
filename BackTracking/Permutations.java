package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    private static List<Integer> addToList(int[] nums) {
        List<Integer> res=new ArrayList<>();
        for (int in:nums)
            res.add(in);
        return res;
    }

    private static List<List<Integer>> getPermutations(int [] nums, int start, List<List<Integer>> permutations){
        if(start == nums.length)
            permutations.add(addToList(nums));
        else
            for (int index = start; index < nums.length; index++) {
                swap(index,start,nums);
                getPermutations(nums,start+1,permutations);
                swap(index,start,nums);
            }
        return permutations;
    }

    private static void swap(int index, int start, int[] nums) {
        int temp=nums[index];
        nums[index]=nums[start];
        nums[start]=temp;
    }

    public static void main(String[] args) {
        int [] nums={1,2,3};
        List<List<Integer>> permutations=new ArrayList<>();
        getPermutations(nums,0,permutations);
        System.out.println(permutations);
    }
}
