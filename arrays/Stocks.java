package arrays;

public class Stocks {
    public static void main(String[] args) {
//        int [] prices={80,30,45,100,120};
        int [] prices={250,70,65,50,200};
        System.out.println(getProfit(prices));
    }

    private static int getProfit(int[] prices){
        int min=prices[0];
        int max=0;
        int minIndex=0;
        for (int i = 1; i < prices.length; i++) {
            if(min > prices[i] ){
                min=prices[i];
                minIndex=i;
            }
        }
//        System.out.println(min);
        for (int i = minIndex; i < prices.length; i++) {
            if(prices[i] > max ){
                max=prices[i];
            }
        }
//        System.out.println(max);
        if(max-min > 0)
            return max-min;
        return 0;
    }
}
