package MockAssessment;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms {

    public static void main(String[] args) {
        int [][]intervals={{0,30},{5,10},{15,20}};//false
//        int [][]intervals={{7,10},{2,4}};//true
        System.out.println(getStatus(intervals));
    }
    private static boolean getStatus(int [] [] intervals){
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        for (int i = 1; i < intervals.length; i++)
            if(intervals[i-1][1] > intervals[i][0])
                return false;
        return true;
    }

}
