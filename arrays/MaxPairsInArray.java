package arrays;

import java.util.HashMap;
import java.util.Map;

public class MaxPairsInArray {

//    https://leetcode.com/problems/maximum-number-of-pairs-in-array/
//    Chaitanya
    public static void main(String[] args) {
//        int[] nums={1,3,2,1,3,2,2};
//        int[] nums={1,1};
        int[] nums={0};
        System.out.println(numberOfPairs(nums));
    }

    private static int[] numberOfPairs(int[] nums) {
        int[] numberofPairs = new int[2];
        int pairsCount=0;
        Map<Integer,Integer> pairsRecords= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            pairsRecords.put(nums[i],pairsRecords.getOrDefault(nums[i],0)+1);
            if(pairsRecords.get(nums[i])==2){
                pairsRecords.remove(nums[i]);
                pairsCount++;
            }
        }
        numberofPairs[0]=pairsCount;
        numberofPairs[1]=pairsRecords.size();
        return numberofPairs;
    }
}
