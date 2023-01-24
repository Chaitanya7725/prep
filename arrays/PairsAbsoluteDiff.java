package arrays;

public class PairsAbsoluteDiff {

//    https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/
    public static void main(String[] args) {
        int[] nums={1,2,2,1};
        int k=1;
        int pairs=countKDifference(nums,k);
        System.out.println(pairs);
    }

    private static int countKDifference(int[] nums, int k) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if(Math.abs(nums[i]-nums[j])==k)
                    count++;
            }
        }
        return count;
    }
}
