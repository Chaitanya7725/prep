package arrays;

public class HighestAltitude {

//    https://leetcode.com/problems/find-the-highest-altitude/
    public static void main(String[] args) {
//        int[] gain={-5,1,5,0,-7};
        int[] gain={-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }

    private static int largestAltitude(int[] gain) {
        int max=0;
        int count=0;
        for (int i = 0; i < gain.length; i++) {
            count+=gain[i];
            if(count>max)
                max=count;
        }
        return max;
    }
}
