package arrays.easy;

import java.util.Arrays;
import java.util.Collections;

public class ValidMountaingArray {

    public static void main(String[] args) {
        int[] arr={2,1};
        System.out.println(validMountainArray(arr));//false

        int[] arr1={3,5,5};
        System.out.println(validMountainArray(arr1));//false

        int[] arr2={0,3,2,1};
        System.out.println(validMountainArray(arr2));//true

        int[] arr3={0,1,2,3,4,5,6,7,8,9};
        System.out.println(validMountainArray(arr3));//false
    }

    private static boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;
        int max=Integer.MIN_VALUE;
        int maxIndex=0;
        for (int i = 0; i < arr.length; i++)
            if(arr[i]>max){
                max=arr[i];
                maxIndex=i;
            }
        if(maxIndex==0 || maxIndex== arr.length-1) return false;
        for (int i = 1; i < maxIndex; i++)
            if(arr[i]<=arr[i-1])
                return false;
        for (int i = maxIndex+1; i < arr.length; i++)
            if(arr[i]>=arr[i-1])
                return false;
        return true;
    }
}
