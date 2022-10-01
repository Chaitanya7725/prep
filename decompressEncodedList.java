public class decompressEncodedList {

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
        decompressEncodedList d = new decompressEncodedList();
        int[] nums = { 42, 39 };
        d.decompressRLElist(nums);
    }

}
