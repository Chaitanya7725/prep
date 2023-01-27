package arrays;

import java.util.Arrays;

public class IntegersSumupZero {

//    Chaitanya: https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
    public static void main(String[] args) {
        int n=4;
        int[] result=sumZero(n);
        System.out.println(Arrays.toString(result));
    }

    private static int[] sumZero(int n) {
        int [] resultArray=new int[n];
        int negative=(n/2)*-1;
        if(n%2==0){
            for (int i = negative; i < n/2+1; i++) {
                if (i!=0 && i<0)
                    resultArray[i+(n/2)]=i;
                else if (i>0)
                    resultArray[i+(n/2)-1]=i;
            }
        }else if(n%2==1){
            for (int i = negative; i < n/2+1; i++)
                resultArray[i+(n/2)]=i;
        }
        return resultArray;
    }

}
