package DynamicProgramming.easy;

public class ClimbingStairs {

    public static void main(String[] args) {
        int n=2;
        System.out.println(climbStairs(n));//2

        int n1=3;
        System.out.println(climbStairs(n1));//3
    }
    private static int climbStairs(int n) {

        int one=0;
        int two=1;
        for (int i = n; i >=0 ; i--) {
            int temp=one;
            one+=two;
            two=temp;
        }
        return one;
    }

}
