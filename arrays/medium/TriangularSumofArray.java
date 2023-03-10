package arrays.medium;

public class TriangularSumofArray {

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        System.out.println(triangularSum(nums));//8

        int[] nums1={5};
        System.out.println(triangularSum(nums1));//5
    }

    private static int triangularSum(int[] nums) {
        for (int i = nums.length; i >=0 ; i--) {
            for (int j = 1; j < i; j++) {
                if((nums[j]+nums[j-1])>9)
                    nums[j-1]=(nums[j]+nums[j-1])%10;
                else
                    nums[j-1]=nums[j]+nums[j-1];
            }
        }
        return nums[0];
    }

}
