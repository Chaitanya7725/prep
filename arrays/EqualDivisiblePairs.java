package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class EqualDivisiblePairs {

    public static void main(String[] args) {
        int[] nums={3,1,2,2,2,1,3};
        int k=2;
        int result=countPairs(nums,k);
        System.out.println(result);
    }

    private static int countPairs(int[] nums, int k) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j] && (i*j%2)==0)
                    count++;
            }
        }
        return count;
    }
}
