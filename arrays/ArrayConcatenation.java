package arrays;

import java.util.Arrays;

public class ArrayConcatenation {

    public int[] getConcatenation(int[] nums) {
        int totalSize = nums.length * 2;
        int[] ans = Arrays.copyOf(nums, totalSize);
        int counter = 0;
        for (int i = nums.length; i < totalSize; i++) {
            ans[nums.length + counter] = nums[counter];
            counter++;
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayConcatenation a = new ArrayConcatenation();
        int[] nums = { 1, 2, 1 };
        int[] output = a.getConcatenation(nums);
        for (int i : output) {
            System.out.println(output[i]);
        }
    }

}
