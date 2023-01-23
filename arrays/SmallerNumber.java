package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number
public class SmallerNumber {
    public static void main(String[] args) {
//        int[] nums=new int[]{8,1,2,2,3};
//        int[] nums=new int[]{6,5,4,8};
        int[] nums=new int[]{7,7,7,7};
        int[] smaller=smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(smaller));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] numsCloned=nums.clone();
        Arrays.sort(numsCloned);
        Map<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < numsCloned.length; i++) {
            if(!map.containsKey(numsCloned[i]))
                map.put(numsCloned[i],i);
        }
        for (int i = 0; i < nums.length; i++)
            numsCloned[i]=map.get(nums[i]);
        return numsCloned;
    }
}
