package arrays;

import java.util.Arrays;

public class ApplesinBasket {

    public static void main(String[] args) {
        int[] weight={100,200,150,1000};
        maxNumberOfApples(weight);

        int[] weight1={900,950,800,1000,700,800};
        maxNumberOfApples(weight1);
    }

    private static int maxNumberOfApples(int[] weight) {
        Arrays.sort(weight);
        int count=0;
        int sum=0;
        for (int i = 0; i < weight.length; i++)
            if(sum+weight[i]<=5000){
                sum+=weight[i];
                count++;
            }
        return count;
    }

}
