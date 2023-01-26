package arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Subset {

//    https://leetcode.com/problems/subsets/
    static List<List<Integer>> res=new LinkedList<>();
    static int [] arr;
    public static void main(String[] args) {
        int[] nums={1,2,3};
//        int[] nums={1,2};
        System.out.println(subsets(nums));
    }
    private static List<List<Integer>> subsets(int[] nums) {
        arr=nums;
        dfs(new LinkedList<>(),0);
        int sum1=0;
        for (List<Integer> arr : res)
            for(int i: arr)
                sum1+=i;
        System.out.println(sum1);
        return res;
    }

    private static void dfs(List<Integer> sub,int currIndex){
        if(sub.size()%2==1)
            res.add(new ArrayList<>(sub));
        for (int i = currIndex; i < arr.length; i++) {
            sub.add(arr[i]); //adding to subarray
            dfs(sub, i + 1); //traversing
            sub.remove(sub.size() - 1); //to remove the elements to avoid duplicates
        }
    }

}
