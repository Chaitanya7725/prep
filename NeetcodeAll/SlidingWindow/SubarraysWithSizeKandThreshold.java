package SlidingWindow;

import java.util.LinkedList;

public class SubarraysWithSizeKandThreshold {

    public static void main(String[] args) {
        int[] arr={11,13,17,23,29,31,7,5,2,};
        int k=3;
        int threshold=5;
        System.out.println(numOfSubarrays(arr, k, threshold));
    }

    private static int numOfSubarrays(int[] arr, int k, int threshold) {
        // Chaitanya
        // Used Linkedlist to save the window elements
        int res=0;
        int sum=0;
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
            sum+=arr[i];
            if(list.size()>k){
                sum-=list.get(0);
                list.removeFirst();
            }
            if(list.size()==k){
//                sum = list.stream().reduce(0, (a, b) -> a + b);
                if(sum/k>=threshold)
                    res++;
            }
        }
        return res;
    }

}
