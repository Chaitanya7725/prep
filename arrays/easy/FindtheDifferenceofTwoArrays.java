package arrays.easy;

import java.util.*;

public class FindtheDifferenceofTwoArrays {

    public static void main(String[] args) {
        int[] nums1={1,2,3};
        int[] nums2={2,4,6};
        System.out.println(findDifference(nums1,nums2));

        int[] nums3={1,2,3,3};
        int[] nums4={1,1,2,2};
        System.out.println(findDifference(nums3,nums4));

        int[] nums5={1,2,2,3};
        int[] nums6={1,2,2,4};
        System.out.println(findDifference(nums5,nums6));

    }

    private static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> n1=new HashSet<>();
        Set<Integer> n2=new HashSet<>();
        Set<Integer> common=new HashSet<>();
        Arrays.stream(nums1).forEach(n->n1.add(n));
        Arrays.stream(nums2).forEach(n->n2.add(n));
        n1.stream().filter(n->(n2.contains(n))).forEach(n->common.add(n));
        n1.removeAll(common);
        n2.removeAll(common);
        return Arrays.asList(new ArrayList<>(n1),new ArrayList<>(n2));
    }
}
