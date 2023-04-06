package Random;

import java.math.BigInteger;

public class extraLongFactorials {

    public static void extraLongFactorials(int n) {
        BigInteger big = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            big = big.multiply(BigInteger.valueOf(i));
        }
        System.out.println(big);
    }

    public static void main(String[] args) {
        extraLongFactorials(25);
    }
}
