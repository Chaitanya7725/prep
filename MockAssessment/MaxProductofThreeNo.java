package MockAssessment;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaxProductofThreeNo {

    public static void main(String[] args) {
        int max=3;
        int [] nums= {2, 4, 7, 1, 5, 3};//754=140
        System.out.println(maximumProduct(nums,max));
        int [] nums1= {-1,-2,-3};//-6
        System.out.println(maximumProduct(nums1,max));
        int [] nums2= {-100,-98,-1,2,3,4};//39200
        System.out.println(maximumProduct(nums2,max));
    }

    public static int maximumProduct(int[] nums,int max) {
        /*int sum=1;
        PriorityQueue<Integer> records=new PriorityQueue<>((a,b) -> a > b ? -1 : 1);
        for (int i = 0; i < nums.length; i++)
            records.add(nums[i]);
        while(max-->0)
            sum*=records.poll();
        return sum;*/
        Arrays.sort(nums);
        int l=nums.length;
        return Math.max(nums[l-1]*nums[l-2]*nums[l-3],nums[l-1]*nums[l-l]*nums[l-l+1]);
    }

}
