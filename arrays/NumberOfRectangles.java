package arrays;

import java.util.SortedMap;
import java.util.TreeMap;

public class NumberOfRectangles {

//    https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/
    public static void main(String[] args) {
        int[][] rectangles={{5,8},{3,9},{5,12},{16,5}};
//        int[][] rectangles= {{2, 3}, {3, 7}, {4, 3}, {3, 7}};
        System.out.println(countGoodRectangles(rectangles));
    }

    private static int countGoodRectangles(int[][] rectangles) {
        SortedMap<Integer,Integer> record=new TreeMap<>();
        for (int[] array : rectangles) {
            int lowest=Integer.MAX_VALUE;
            for (int dimensions : array) {
                if(dimensions < lowest)
                    lowest=dimensions;
            }
            record.put(lowest,record.getOrDefault(lowest,0)+1);
        }
        System.out.println(record);
        return record.get(record.lastKey());
    }
}
