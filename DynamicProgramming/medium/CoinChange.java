package DynamicProgramming.medium;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * CoinChange
 */
public class CoinChange {
    public static void main(String[] args) {
        int [] coins={1,2,5};
        int amount=11;
//        System.out.println(coinChange(coins,amount));

        int [] coins1={2};
        int amount1=3;
//        System.out.println(coinChange(coins1,amount1));

        int [] coins2={1};
        int amount2=0;
//        System.out.println(coinChange(coins2,amount2));

        int [] coins3={1,5,7};
        int amount3=18;
        int [] dp1=new int[amount3+1];
        Arrays.fill(dp1,-1);
        System.out.println(coinChange(coins3,amount3, dp1));
    }

//    private static int coinChange(int[] coins, int amount) {
//        int dp[]=new int[amount+1];
//        for (int i = 0; i < dp.length; i++)
//            dp[i]=amount+1;
//        dp[0]=0;
//
//        for (int a = 1; a <= amount; a++)
//            for (int c : coins)
//                if(a-c >= 0)
//                    dp[a]=Integer.min(dp[a], 1 + dp[a - c]);
//        return dp[amount] != amount+1 ? dp[amount] : -1;
//    }

    private static int coinChange(int[] coins, int amount,int [] dp) {
        if (amount == 0) return 0;
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            if (amount - coins[i] >= 0) {
                int subAns = 0;
                subAns = dp[amount - coins[i]] != -1 ? dp[amount - coins[i]] : coinChange(coins, amount - coins[i], dp);
                if (subAns != Integer.MAX_VALUE && subAns + 1 < minimum)
                    minimum = subAns + 1;
            }
        }
        return minimum;
    }
}