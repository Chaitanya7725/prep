package Random;

public class Factorial {
    public static void main(String[] args) {

        int number=5;
        System.out.println(fact(number));
    }

    private static int fact(int number) {
        if(number==0){
            return 1;
        }
        return number*fact(number-1);
    }
}
