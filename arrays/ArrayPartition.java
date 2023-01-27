package arrays;

import java.util.*;

public class ArrayPartition {


    //Complicated but working for partial cases.
    static List<List<Integer>> res=new ArrayList<>();
    static int[] arr;
    public static void main(String[] args) {
        int [] sum={1,4,3,2};
//        int [] sum={6,2,6,5,1,2};
        System.out.println(arrayPairSum(sum));
    }

    private static int arrayPairSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        arr=nums;
        int val=0;
        dfs(new LinkedList<>(),0);
        List<Integer> act=new ArrayList<>();
        for (List<Integer> re : res)
            if(re.size()==2)
                act.add(Collections.min(re));

        for (int i = 0; i < act.size()/2; i++){
            val=act.get(i)+act.get(act.size()-1-i);
            if(val > max)
                max=val;
        }
        return val;
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
