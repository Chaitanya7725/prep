package arrays.medium;

import java.util.Arrays;

public class DivideTwoIntegers {

    public static void main(String[] args) {
//        int dividend=7;
//        int divisor=-3;//-2

//        int dividend=-1;
//        int divisor=1;//-1

//        int dividend=1;
//        int divisor=1;//1

        int dividend=-2147483648;
        int divisor=-1;//2147483648
//
//        int dividend=7;
//        int divisor=-3;//-2
//
//        int dividend=7;
//        int divisor=-3;//-2

        System.out.println(divide(dividend, divisor));
    }

    private static int divide(int dividend, int divisor) {
        int count=0;
        int minusCount=0;
        if(dividend<0){
            dividend=Integer.valueOf(String.valueOf(dividend).substring(1));
            minusCount++;
        }
        if(divisor<0){
            divisor=Integer.valueOf(String.valueOf(divisor).substring(1));
            minusCount++;
        }
        int c=dividend+divisor;
        while(c-divisor>=divisor){
            c-=divisor;
            count++;
        }
        if(minusCount==1)
            count=Integer.valueOf("-"+count);
        if(Math.abs(divisor)==1 && Math.abs(dividend)>2147483647)
            return Integer.valueOf(String.valueOf(dividend).substring(1));
        return 2147483647+1;
    }

}
