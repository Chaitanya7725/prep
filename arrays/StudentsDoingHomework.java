package arrays;

public class StudentsDoingHomework {

//    https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/
//    Chaitanya
    public static void main(String[] args) {
        int[] startTime={1,2,3};
        int[] endTime={3,2,7};
        int queryTime=4;
        System.out.println(busyStudent(startTime,endTime,queryTime));

    }

    private static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count=0;
        for (int i = 0; i < startTime.length; i++) {
//            System.out.println((endTime[i]-startTime[i])+" "+((endTime[i]-queryTime)+(queryTime-startTime[i])));
            if(startTime[i]<=queryTime && endTime[i]>=queryTime && (endTime[i]-startTime[i])==((endTime[i]-queryTime)+(queryTime-startTime[i])))
                count++;
        }
        return count;
    }

}
