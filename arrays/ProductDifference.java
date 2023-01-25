package arrays;

public class ProductDifference {

    public static void main(String[] args) {
//        https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
        int[] nums={5,6,2,7,4};//34 7,6
        int product=maxProductDifference(nums);
        System.out.println(product);

        int[] nums1={4,2,5,9,7,4,8};//64 9,8
        product=maxProductDifference(nums1);
        System.out.println(product);
    }

    private static int maxProductDifference(int[] nums) {
        int product = 0;
        int max = 0;
        int secondLargest=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
                secondLargest=max;
                max=nums[i];
            }else if(nums[i]>secondLargest)
                secondLargest=nums[i];
        }

        int min = Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<min){
                secondSmallest=min;
                min=nums[i];
            }else if(nums[i]<secondSmallest)
                secondSmallest=nums[i];
        }
        product=Math.abs(max*secondLargest-min*secondSmallest);
        return product;
    }
}
