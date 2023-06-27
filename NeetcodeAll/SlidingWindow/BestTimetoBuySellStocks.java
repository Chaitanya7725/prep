package SlidingWindow;

public class BestTimetoBuySellStocks {

    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int left=0;
        int right=1;
        int maxProfit=0;
        while(right<prices.length){
            if(prices[left]<prices[right])
                maxProfit=Integer.max(maxProfit,prices[right]-prices[left]);
            else
                left++;
            right++;
        }
        return maxProfit;
    }


}
