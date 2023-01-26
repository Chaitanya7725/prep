package arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class XorSum {

//    https://leetcode.com/problems/sum-of-all-subset-xor-totals/
    static List<List<Integer>> res=new LinkedList<>();
    static int arr[];
    public static void main(String[] args) {
//        int[] nums={1,3};
        int[] nums = {5, 1, 6};
        System.out.println(subsetXORSum(nums));
    }

    private static int subsetXORSum(int[] nums) {
        arr=nums;
        dfs(new LinkedList<>(),0);

        int sum1=0;
        int temp;
        for (List<Integer> arr : res)
            if(arr.size()==1)
                sum1+=arr.get(0);
            else if(arr.size()>1){
                temp=0;
                for (int i = 0; i < arr.size(); i++)
                    temp ^= arr.get(i);
                sum1+=temp;
            }
        return sum1;
    }

    private static void dfs(LinkedList<Integer> sub, int currentIndex) {
        res.add(new ArrayList<>(sub));
        for (int i = currentIndex; i < arr.length; i++) {
            sub.add(arr[i]);
            dfs(sub,i+1);
            sub.remove(sub.size()-1);
        }
    }

}
