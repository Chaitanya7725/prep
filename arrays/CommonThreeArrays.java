package arrays;

import java.util.ArrayList;
import java.util.List;

public class CommonThreeArrays {

    public static void main(String[] args) {
//        int[] arr1={1,2,3,4,5},arr2={1,2,5,7,9},arr3={1,3,4,5,8};
        int[] arr1={197,418,523,876,1356},arr2={501,880,1593,1710,1870},arr3={521,682,1337,1395,1764};
        System.out.println(arraysIntersection(arr1,arr2, arr3));
    }

    private static List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        // Chaitanya: Followed Pointer approach to match or increment it
        List<Integer> intersectionList=new ArrayList<>();
        int pointer1=0,pointer2=0,pointer3=0;
        while(pointer1<arr1.length && pointer2<arr2.length && pointer3<arr3.length){
            if(arr1[pointer1]==arr2[pointer2] && arr1[pointer1]==arr3[pointer3]){
                intersectionList.add(arr1[pointer1]);
                pointer1++;
                pointer2++;
                pointer3++;
            }
            else{
                if(arr1[pointer1]<arr2[pointer2])
                    pointer1++;
                else if (arr2[pointer1]<arr3[pointer3])
                    pointer2++;
                else
                    pointer3++;
            }
        }
        return intersectionList;
    }
}
