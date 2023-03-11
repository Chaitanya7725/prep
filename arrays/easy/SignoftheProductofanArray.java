package arrays.easy;

public class SignoftheProductofanArray {

    public static void main(String[] args) {
        int [] nums = {-1,-2,-3,-4,3,2,1};
        System.out.println(arraySign(nums));//1

        int [] nums1 = {1,5,0,2,-3};
        System.out.println(arraySign(nums1));//0

        int [] nums2 = {-1,1,-1,1,-1};
        System.out.println(arraySign(nums2));//-1

        int [] nums3 = {29, -49, -22, -77, -17, -66, -75, -44, -30, -24};//-1
        System.out.println(arraySign(nums3));

        int [] nums4 = {56, 32, 76, 92, 78, 91, -100, -82, -40, -63, -48, -55, -59, -81, -35, -59, -29};//-1
        System.out.println(arraySign(nums4));
    }

    private static int arraySign(int[] nums) {
        int product=1;
        for (int num:nums)
            if(num==0) return 0;
            else if(num<0)
                product*=-1;
        return product;
    }

}
