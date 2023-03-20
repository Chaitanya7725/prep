package arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {

    public static void main(String[] args) {
        int[] nums={1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));

        int[] nums1={1,2,3,4};
        System.out.println(findLHS(nums1));

        int[] nums2={1,1,1,1};
        System.out.println(findLHS(nums2));

        int[] nums3={1,2,2,3,4,5,1,1,1,1};
        System.out.println(findLHS(nums3));
    }

    private static int findLHS(int[] nums) {
        int result=0;
        Map<Integer,Integer> records=new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            records.put(nums[i], records.getOrDefault(nums[i],0)+1);
        for (int i: records.keySet())
            if(records.containsKey(i+1))
                result=Math.max(result,records.get(i)+records.get(i+1));
        return result;
    }

}
