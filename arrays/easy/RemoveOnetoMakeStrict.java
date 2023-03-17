package arrays.easy;

public class RemoveOnetoMakeStrict {

    public static void main(String[] args) {
        //referred form YT
        int[] nums={1,2,10,5,7};
        System.out.println(canBeIncreasing(nums));//true

        int[] nums1={2,3,1,2};
        System.out.println(canBeIncreasing(nums1));//false

        int[] nums2={1,1,1};
        System.out.println(canBeIncreasing(nums2));//false

        int[] nums3={1,2,3};
        System.out.println(canBeIncreasing(nums3));//false

        int[] nums5={100,21,100};
        System.out.println(canBeIncreasing(nums5));//true
    }

    private static boolean canBeIncreasing(int[] nums) {
        int lcount=0,rcount=0;
        int last=nums[nums.length-1];
        for (int i = nums.length-2; i >= 0 ; i--)
            if(nums[i] < last)
                last=nums[i];
            else
                rcount++;

        last=nums[0];
        for (int i = 1; i < nums.length ; i++)
            if(nums[i] > last)
                last=nums[i];
            else
                lcount++;
        return Integer.min(lcount,rcount)<=1;
    }

}
