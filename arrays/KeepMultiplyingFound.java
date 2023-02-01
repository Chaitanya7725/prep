package arrays;

import java.util.ArrayList;
import java.util.List;

public class KeepMultiplyingFound {

//    https://leetcode.com/problems/keep-multiplying-found-values-by-two/
    static List<Integer> list=new ArrayList<>();
    public static void main(String[] args) {
        int[] nums={5,3,6,1,12};
        int original=3;
        System.out.println(findFinalValue(nums,original));
        int[] nums1={2,7,9};
        int original1=4;
        System.out.println(findFinalValue(nums1,original1));
        int[] nums2={1,16,13,19,12,10};
        int original2=2;
        System.out.println(findFinalValue(nums2,original2));//2
    }

    private static int findFinalValue(int[] nums, int original) {
        list.clear();
        int num=original;
        for (int i: nums)
            list.add(i);
        return check(num);
    }

    private static int check(int num) {
        if(!list.contains(num))
            return num;
        else
            num=check(num*=2);
        return num;
    }

}
