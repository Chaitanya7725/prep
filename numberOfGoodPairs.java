public class numberOfGoodPairs {

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
        numberOfGoodPairs n = new numberOfGoodPairs();
        int[] nums = { 1, 2, 3 };
        n.numIdenticalPairs(nums);
    }

}
