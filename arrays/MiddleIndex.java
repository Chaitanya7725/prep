package arrays;

import java.util.Arrays;

public class MiddleIndex {

    public static void main(String[] args) {
        int [] nums={2,3,-1,8,4};
        System.out.println(findMiddleIndex(nums));//3
        int [] nums1={1,-1,4};
        System.out.println(findMiddleIndex(nums1));//2
        int [] nums2={2,5};
        System.out.println(findMiddleIndex(nums2));//-1
        int [] nums3={1};
        System.out.println(findMiddleIndex(nums3));//0
        int [] nums4={4,0};
        System.out.println(findMiddleIndex(nums4));//0
        int [] nums5={0,0,0,0};
        System.out.println(findMiddleIndex(nums5));//0
        int [] nums6={-2,4,-3,1,0};
        System.out.println(findMiddleIndex(nums6));//1


    }

    private static int findMiddleIndex(int[] nums) {
        int left=0;
        int right = Arrays.stream(nums).reduce(0, (a, b) -> a + b);
        if (nums.length==1) return 0;
        else if(nums.length<2) return -1;
        int pointer=0;
        for (int i = 0; i < nums.length; i++) {
            if(pointer>0)
                left+=nums[pointer-1];
            right-=nums[pointer];
            if(left==right)
                return i;
            pointer++;
        }
        return -1;
    }

}
