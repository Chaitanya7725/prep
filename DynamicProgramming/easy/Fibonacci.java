package DynamicProgramming.easy;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(4));
//        fun(5);
    }

    private static void fun(int i) {
        if(i==0)
            return;
        fun(i-1);
        System.out.println(i);
    }

    private static int fibo(int i) {
        if(i<2)
            return i;
        return fibo(i-1) + fibo(i-2);
    }
}
