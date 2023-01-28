package arrays;

import java.util.HashMap;
import java.util.Map;

public class SumofUniqueElements {

//    https://leetcode.com/problems/sum-of-unique-elements/
//    Chaitanya
    public static void main(String[] args) {
        int[] nums={1,2,3,2};
        System.out.println(sumOfUnique(nums));
    }

    private static int sumOfUnique(int[] nums) {
        int count=0;
        Map<Integer,Integer> records=new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            records.put(nums[i],records.getOrDefault(nums[i],0) +1);
        for (Integer i : records.keySet())
            if(records.get(i)<2)
                count+=i;
        return count;
    }

}
