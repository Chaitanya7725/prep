package arrays;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {

    public static void main(String[] args) {
        int[] candyType={1,1,2,2,3,3};
        System.out.println(distributeCandies(candyType));//3

        int[] candyType1={1,1,2,3};
        System.out.println(distributeCandies(candyType1));//2

        int[] candyType2={6,6,6,6};
        System.out.println(distributeCandies(candyType2));//1
    }

    public static int distributeCandies(int[] candyType) {
        Set<Integer> records=new HashSet<>();
        for (int i = 0; i < candyType.length; i++) {
            records.add(candyType[i]);
        }
        return candyType.length/2 < records.size() ? candyType.length/2 : records.size();
    }

}
