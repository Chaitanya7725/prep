package DynamicProgramming.easy;

import java.util.Arrays;

public class Tribonacci {

    public static void main(String[] args) {
        //1 2 3 4 5 6 7  8  9  10 11  12 13
        //0,1,1,2,4,7,13,24,44,81,149,274,504
        int n=4;
        System.out.println(tribonacci(n));//4

        int n1=25;
        System.out.println(tribonacci(n1));//1389537

        int n2=35;
        System.out.println(tribonacci(n2));//615693474
    }

    private static int tribonacci(int n) {
//        int dp[] = {0, 1, 1};
//        for (int i = 3; i <= n; i++)
//            dp[i%3]=dp[0]+dp[1]+dp[2];
//        return dp[n%3];

        int [] res=new int[n+1];
        Arrays.fill(res, -1);
        return trib(n,res);
    }

    private static int trib(int n, int[] res) {
        if(n<2) return n;
        if(n==2) return 1;
        if (res[n] != -1) return res[n];
        return trib(n-1,res)+trib(n-2,res)+trib(n-3,res);
    }

}
