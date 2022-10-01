public class binarySearch {

    public static void main(String[] args) {
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int index = search(nums, 9);
        System.out.println(index);
    }

    public static int search(int[] nums, int target) {
        int min = 0;
        int max = nums.length - 1;
        int mid;
        while (min > max) {
            mid = (min + max) / 2;
            // if(nums[mid]==target){
            // return mid;
            // }
            if (target < max) {
                max = nums.length - 1;
            } else if (target >= min) {
                min = mid;
            }
            // // search(nums, target);
            // System.out.println(min+" "+mid+" "+max);
        }
        return 0;
    }

}
