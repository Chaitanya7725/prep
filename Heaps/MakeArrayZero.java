package Heaps;

import java.util.*;

public class MakeArrayZero {

    public static void main(String[] args) {
        int[] nums={1,5,0,3,5};
        System.out.println(minimumOperations(nums));
        int[] nums1={5,5,5,5,5};
        System.out.println(minimumOperations(nums1));
    }

    private static int minimumOperations(int[] nums) {
        Set<Integer> set=new HashSet<>();
        Arrays.stream(nums).forEach((a)->{
            if(a!=0)
                set.add(a);
        });
        return set.size();
    }

}
