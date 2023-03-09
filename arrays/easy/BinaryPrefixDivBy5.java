package arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivBy5 {

    public static void main(String[] args) {
        int[] nums={0,1,1};
        System.out.println(prefixesDivBy5(nums));

        int[] nums1={1,1,1};
        System.out.println(prefixesDivBy5(nums1));

        int[] nums2={0,1,1,1,1,1};
        System.out.println(prefixesDivBy5(nums2));

        int[] nums3={1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1};
        System.out.println(prefixesDivBy5(nums3));
    }

    private static List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> results=new ArrayList<>();
        int b=0;
        for (int i:nums) {
            b=(b << 1| i )%5;
            results.add(b==0);
        }
        return results;
    }

}
