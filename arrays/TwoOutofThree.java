package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoOutofThree {

//    https://leetcode.com/problems/two-out-of-three/
    public static void main(String[] args) {

//        int[] nums1={1,1,3,2};
//        int[] nums2={2,3};
//        int[] nums3={3};
        int[] nums1={3,1};
        int[] nums2={2,3};
        int[] nums3={1,2};
        System.out.println(twoOutOfThree(nums1,nums2,nums3));

    }

    private static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        Set<Integer> set=new HashSet<>();
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        Set<Integer> set3=new HashSet<>();

        for (int i : nums1) {
            set.add(i);
            set1.add(i);
        }
        for (int i : nums2) {
            set.add(i);
            set2.add(i);
        }
        for (int i : nums3) {
            set.add(i);
            set3.add(i);
        }

        List<Integer> two=new ArrayList<>();
        for (int i : set) {
            if(set1.contains(i) && set2.contains(i) || set1.contains(i) && set3.contains(i) || set2.contains(i) && set3.contains(i)){
                two.add(i);
            }
        }
        return two;
    }


}
