import java.util.HashMap;

/**
 * two_sums
 * leetcode url: https://leetcode.com/problems/two-sum/
 */
public class two_sums {

    public int[] helper(int[] nums, int target) {
        int count = 0;
        int[] output = { 0, 1 };
        if (nums.length == 2) {
            return output;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }
        for (Integer name : map.keySet()) {
            int key = name;
            int value = map.get(key);
            int diff = target - value;
            if (map.containsValue(diff)) {
                output[count] = key;
                count++;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        // int[] arr = { 2, 11, 7, 15 };
        // int target = 9;

        int[] arr = { 3, 2, 4 };
        int target = 6;

        // int[] arr = { 3, 1, 3 };
        // int target = 6;

        two_sums two_sums = new two_sums();
        for (int i : two_sums.helper(arr, target)) {
            System.out.print(i + " ");
        }
    }
}