package arrays;

public class shuffleArray {

    //https://leetcode.com/problems/shuffle-the-array/
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[n * 2];
        for (int i = 0; i < n; i++) {
            int j = i * 2;
            result[j] = nums[i];
            result[j + 1] = nums[i + n];
            // System.out.println(j + " " + nums[i] + " " + nums[n + i]);
        }
        return result;
    }

    public static void main(String[] args) {
        shuffleArray s = new shuffleArray();
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        int[] res = s.shuffle(nums, n);
        for (int i : res) {
            System.out.print(res[i] + " ");
        }
    }

}
