package arrays;

import java.util.Arrays;

public class MaximumUnitsonTruck {

//    https://leetcode.com/problems/maximum-units-on-a-truck/
    public static void main(String[] args) {
        int[][] boxTypes={{1,3},{2,2},{3,1}};
        int truckSize=4;//8
        System.out.println(maximumUnits(boxTypes, truckSize));
        int[][] boxTypes1={{5,10},{2,5},{4,7},{3,9}};
        int truckSize1=10;//91
        System.out.println(maximumUnits(boxTypes1, truckSize1));
    }

    private static int maximumUnits(int[][] boxTypes, int truckSize) {
        int noofBoxes=0;
        int sum=0;
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1],a[1]));
        for (int[] box : boxTypes) {
            if(noofBoxes<=truckSize && box[0]<=(truckSize-noofBoxes)) {
                noofBoxes+=box[0];
                sum+=(box[0]*box[1]);
            } else {
                if(box[0]>=(truckSize-noofBoxes)) {
                    int remaining=truckSize-noofBoxes;
                    noofBoxes+=remaining;
                    sum+=remaining * box[1];
                    return sum;
                }
            }
        }
        return sum;
    }
}
