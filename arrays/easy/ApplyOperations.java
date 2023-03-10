package arrays.easy;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class ApplyOperations {

    public static void main(String[] args) {
        int[] nums={1,0,2,0,0,1};
//        applyOperations(nums);
        int[] nums1={1,2,2,1,1,0};
//        applyOperations(nums1);
    }

    private static int[] applyOperations(int[] nums) {
        Queue<Integer> zerosIndex=new PriorityQueue<>();
        Queue<Integer> nonZeroIndex=new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++)
            if(nums[i]==0)
                zerosIndex.add(i);
            else
                nonZeroIndex.add(i);
        while(!nonZeroIndex.isEmpty()) {
            int zero = nums[zerosIndex.peek()];
            int non = nums[nonZeroIndex.peek()];
            if(non>zero)
                nonZeroIndex.poll();
            else{
                nums[zerosIndex.peek()] = non;
                nums[nonZeroIndex.peek()] = zero;
                zerosIndex.poll();
                nonZeroIndex.poll();
            }
        }
        return new int[]{};
    }

}
