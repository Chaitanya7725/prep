package arrays;

public class GoodPairs {

    //https://leetcode.com/problems/number-of-good-pairs/
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        GoodPairs n = new GoodPairs();
        int[] nums = { 1, 2, 3 };
        n.numIdenticalPairs(nums);
    }

}
