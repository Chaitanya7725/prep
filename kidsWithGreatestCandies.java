import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * kidsWithCandies
 */
public class kidsWithGreatestCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int length = candies.length;
        List<Boolean> arr = new ArrayList<>();
        int max = getMax(candies);
        for (int i = 0; i < length; i++) {
            if (candies[i] + extraCandies >= max) {
                arr.add(true);
            } else {
                arr.add(false);
            }
        }
        return arr;
    }

    private int getMax(int[] candies) {
        int max = candies[candies.length - 1];
        for (int i = 0; i < candies.length - 1; i++) {
            // System.out.println(candies[i] + " " + candies[i + 1]);
            if (candies[i] >= candies[i + 1] && candies[i] > max) {
                max = candies[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        kidsWithGreatestCandies k = new kidsWithGreatestCandies();
        int[] candies = { 1, 3, 9 };
        int extraCandies = 4;
        k.kidsWithCandies(candies, extraCandies);
    }

}