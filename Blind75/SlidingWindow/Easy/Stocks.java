package Blind75.SlidingWindow.Easy;

public class Stocks {

    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        // Chaitanya
        int left=0;
        int right=1;
        int maxProfit=0;
        while(right<prices.length){
            if(prices[left]<prices[right]){
                int profit=prices[right]-prices[left];
                maxProfit=Integer.max(profit,maxProfit);
            }else
                left=right;
            right+=1;
        }
        return maxProfit;
    }

}
