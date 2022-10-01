public class arithmeticTriplets {

    public int arithmeticTriplet(int[] nums, int diff) {
        int length = nums.length;
        int triplets = 0;
        int num1 = 0;
        for (int i = 0; i < length; i++) {
            int count = 0;
            for (int j = i; j < length; j++) {
                if (nums[i] != nums[j]) {
                    num1 = nums[j];
                    System.out.println(nums[i] + " " + num1 + " " + (Math.abs(nums[j] - num1)));
                }
            }
        }
        return triplets;
    }

    public static void main(String[] args) {
        arithmeticTriplets a = new arithmeticTriplets();
        int[] nums = { 4, 5, 6, 7, 8, 9 };
        int diff = 2;
        int result = a.arithmeticTriplet(nums, diff);
        System.out.println(result);
    }
}