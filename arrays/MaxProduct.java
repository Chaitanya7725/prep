package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/
class MaxProduct {

    public static void main(String[] args) {
//         int nums[] = { 1, 2, 5, 5, 4 };
//        int nums[] = { 3, 7 };
        int nums[] = { 3,4,5,2};
        MaxProduct maxProduct = new MaxProduct();
        int result = maxProduct.maxProduct(nums);
        System.out.println(result);
    }

    public int maxProduct(int[] nums) {

//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++)
//            list.add(nums[i]);
//        Collections.sort(list);
//        return ((list.get(list.size() - 1) - 1) * (list.get(list.size() - 2) - 1));

//        Chaitanya: Used the two variables way to get highest and 2nd highest numbers
        int max=0;
        int secondLargest=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max){
                secondLargest=max;
                max=nums[i];
            }else if (nums[i] > secondLargest){
                secondLargest=nums[i];
            }
        }
        System.out.println(max+" "+secondLargest);
        return (max-1)*(secondLargest-1);
    }

}