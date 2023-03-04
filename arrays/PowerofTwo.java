package arrays;

public class PowerofTwo {

    public static void main(String[] args) {
        int n=1;
        System.out.println(isPowerOfTwo(n));

        int n1=16;
        System.out.println(isPowerOfTwo(n1));

        int n2=3;
        System.out.println(isPowerOfTwo(n2));

        int n3=-16;
        System.out.println(isPowerOfTwo(n3));
    }

    private static boolean isPowerOfTwo(int n) {
        String res=String.valueOf(Math.log10(n)/Math.log10(2));
        return res.charAt(res.length()-1)=='0' ? true : false;
    }

}
