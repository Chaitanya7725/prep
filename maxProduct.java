import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/
class maxProduct {

    public int maxProduct(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
            list.add(nums[i]);
        Collections.sort(list);
        return ((list.get(list.size() - 1) - 1) * (list.get(list.size() - 2) - 1));
    }

    public static void main(String[] args) {
        // int nums[] = { 1, 2, 5, 5, 4 };
        int nums[] = { 3, 7 };
        maxProduct maxProduct = new maxProduct();
        int result = maxProduct.maxProduct(nums);
        System.out.println(result);
    }
}