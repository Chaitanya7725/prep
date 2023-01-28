package arrays;

import java.util.Arrays;

public class FinalPriceWithDiscount {

//    https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
//    Chaitanya
    public static void main(String[] args) {
        int [] prices = {8,4,6,2,3};//[4,2,4,2,3]
//        int [] prices = {1,2,3,4,5};//[1,2,3,4,5]
//        int [] prices = {10,2,5,2,8};//[8,0,3,2,8]
//        int [] prices = {8,7,4,2,8,1,7,7,10,1};//[1,3,2,1,7,0,0,6,9,1]

        System.out.println(Arrays.toString(finalPrices(prices)));
    }

    private static int[] finalPrices(int[] prices) {
        int [] discount=prices.clone();
        for (int i = 0; i < prices.length-1; i++)
            for (int j = i+1; j < prices.length; j++)
                if(prices[j] <= prices[i]) {
                    discount[i] = Math.abs(prices[i] - prices[j]);
                    break;
                }
        return discount;
    }

}
