package arrays;

import java.util.HashMap;
import java.util.Map;

public class NRepeatedElement {

//    https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
//    Chaitanya
    public static void main(String[] args) {
        int[] nums={1,2,3,3};//3
//        int[] nums={2,1,2,5,3,2};//2
//        int[] nums={5,1,5,2,5,3,5,4};//5
        System.out.println(repeatedNTimes(nums));
    }

    private static int repeatedNTimes(int[] nums) {
        int count=0;
        Map<Integer,Integer> recordsofNRepeated=new HashMap<>();
        for (int number : nums){
            recordsofNRepeated.put(number,recordsofNRepeated.getOrDefault(number,0)+1);
            if(recordsofNRepeated.get(number)==nums.length/2)
                return number;
        }
        return count;
    }

}
