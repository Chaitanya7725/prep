package Heaps;

import java.util.Iterator;
import java.util.PriorityQueue;

public class MaximumProductof2Ele {

    public static void main(String[] args) {
        int[] nums={3,4,5,2};//12
        System.out.println(maxProduct(nums));

        int[] nums1={3,7};//12
        System.out.println(maxProduct(nums1));
    }

    private static int maxProduct(int[] nums){
        if(nums.length>2){
            PriorityQueue<Integer> priorityQueue=new PriorityQueue<>((a,b)->{ return a < b ? 1:-1; });
            for (int number : nums)
                priorityQueue.add(number);
            return ((priorityQueue.poll()-1)*(priorityQueue.poll()-1));
        }
        return (nums[0]-1)*(nums[1]-1);
    }

}
