package arrays;

import java.util.Arrays;

public class Seats {

    public static void main(String[] args) {
//        https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/
        int[] seats={3,1,5};
        int[] students={2,7,4};
        int res=minMovesToSeat(seats,students);
        System.out.println(res);
    }

    private static int minMovesToSeat(int[] seats, int[] students) {
        int count=0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0; i < seats.length; i++) {
            count+=Math.abs(seats[i]-students[i]);
        }
        return count;
    }
}
