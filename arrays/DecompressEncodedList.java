package arrays;

public class DecompressEncodedList {

    //https://leetcode.com/problems/decompress-run-length-encoded-list/
    public int[] decompressRLElist(int[] nums) {
        int length = nums.length;
        int size = 0;
        for (int i = 0; i < length; i += 2) {
            size += nums[i];
        }
        int[] array = new int[size];
        int index = 0;
        for (int i = 0; i < length; i += 2) {
            int j = nums[i];
            while (j > 0) {
                array[index] = nums[i + 1];
                j--;
                index++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        DecompressEncodedList d = new DecompressEncodedList();
        int[] nums = { 42, 39 };
        d.decompressRLElist(nums);
    }

}
