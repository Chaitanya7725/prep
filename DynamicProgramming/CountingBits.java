package DynamicProgramming;

import java.util.Arrays;

/**
 * CountingBits
 */
public class CountingBits {
    public static void main(String[] args) {
        int n=3;
        System.out.println(Arrays.toString(countBits(n)));
    }

    private static int[] countBits(int n) {
        int res[] = new int[n + 1];
        for (int i = 0; i <= n; i++)
            res[i]=solve(i);
        return res;
    }

    public static int solve(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        if(n%2==0) return solve(n/2);
        else return 1+solve(n/2);
    }
    
    
}
