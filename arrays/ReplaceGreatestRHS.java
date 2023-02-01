package arrays;

import java.util.Arrays;

public class ReplaceGreatestRHS {

//    https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
    public static void main(String[] args) {
        int [] arr = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));

        int [] arr1 = {400};
        System.out.println(Arrays.toString(replaceElements(arr1)));
    }

    private static int[] replaceElements(int[] arr) {
        int max=-1;
        int [] result=new int[arr.length];
        result[result.length-1]=max;
        for (int i = arr.length-1; i >0 ; i--) {
            if(arr[i]>result[i]){
                result[i-1]=arr[i];
                max=arr[i];
            }
            else
                result[i-1]=max;
        }
        return result;
    }

}
