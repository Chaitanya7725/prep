package arrays;

import java.util.Arrays;
import java.util.Stack;

public class SortArrayByParity {

    public static void main(String[] args) {
        int[] nums = {3,1,2,4};//{2,4,1,3}
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
        int[] nums1 = {0};//0
        System.out.println(Arrays.toString(sortArrayByParity(nums1)));
        int[] nums2 = {1};//1
        System.out.println(Arrays.toString(sortArrayByParity(nums2)));
        int[] nums3 = {1,6,2,14575,8,1231,123};
        System.out.println(Arrays.toString(sortArrayByParity(nums3)));
        int[] nums4 = {5,3,1,7,8,4,2,6};
        System.out.println(Arrays.toString(sortArrayByParity(nums4)));
        int[] nums5 = {1,3};//{1,3}
        System.out.println(Arrays.toString(sortArrayByParity(nums5)));
        int[] nums6 = {0,2,1};////{0,2,1}
        System.out.println(Arrays.toString(sortArrayByParity(nums6)));
    }

    private static int[] sortArrayByParity(int[] nums) {
        int result[]=nums.clone();
        int till=0;
        int oddCount=0;
        Stack<Integer> stack =new Stack<>();
        if(result.length>1) {
            for (int i = 0; i < result.length; i++)
                if (result[i] % 2 == 1) {
                    stack.push(result[i]);
                    result[i] = 0;
                    till++;
                    oddCount++;
                }
        }else
            return nums;
        if(!stack.isEmpty() && result.length !=oddCount ){
            Arrays.sort(result);
            for (int i = 0; i <result.length ; i++)
                result[i]=result[result.length-i-1];
            int length = 0;
            if(result.length%2==0)
                length=till;
            else if(result.length%2==1)
                length=till-1;
            for (int i = length; i < result.length; i++)
                if(!stack.isEmpty())
                    result[i]=stack.pop();
        }else
            return nums;
        return result;
    }
}
