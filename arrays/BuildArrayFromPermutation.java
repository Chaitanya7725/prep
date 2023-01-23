package arrays;

//https://leetcode.com/problems/build-array-from-permutation/
public class BuildArrayFromPermutation {

    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        BuildArrayFromPermutation b = new BuildArrayFromPermutation();
        int[] nums = { 0, 2, 1, 5, 3, 4 };
        int[] ans = b.buildArray(nums);
        for (int i : ans) {
            System.out.println(ans[i]);
        }
    }
}
