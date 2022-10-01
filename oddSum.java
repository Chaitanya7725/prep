public class oddSum {

    public int sumOddLengthSubarrays(int[] arr) {
        int length = arr.length;
        while (length > 0) {
            print(arr, length, 0);
            length -= 2;
        }
        return length;
    }

    private void print(int[] arr, int length, int start) {
        while (length > 0) {
            // for (int i = 0; i < i + length; i++) {
            // System.out.print(arr[i] + " ");
            System.out.print(length + " ");
            // }
            length--;
        }
    }

    public static void main(String[] args) {
        oddSum o = new oddSum();
        int[] arr = { 1, 4, 2, 5, 3 };
        o.sumOddLengthSubarrays(arr);
    }
}
