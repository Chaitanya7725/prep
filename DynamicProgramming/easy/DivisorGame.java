package DynamicProgramming.easy;

public class DivisorGame {

    public static void main(String[] args) {
        int n=2;
        System.out.println(divisorGame(n));//true
        int n1=3;
        System.out.println(divisorGame(n1));//false
        int n2=4;
        System.out.println(divisorGame(n2));//true
    }

    private static boolean divisorGame(int n) {
        return n%2==0;
    }

}
