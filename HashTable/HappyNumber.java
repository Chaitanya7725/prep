package HashTable;

public class HappyNumber {
//    https://leetcode.com/problems/happy-number/
    public static void main(String[] args) {
        int n=19;
        System.out.println(isHappyNumber(n));
    }

    private static boolean isHappyNumber(int n) {
        int slow, fast;
        slow = n;
        fast=numSquareSum(n);
        while(fast!=1 && fast!=slow){
            slow = numSquareSum(slow);
            fast = numSquareSum(numSquareSum(fast));
        }
        return (fast == 1);
    }

    public static int numSquareSum(int n){
        int totalSum = 0;
        while (n != 0) {
            int digit = n % 10;
            n = n / 10;
            totalSum += (Math.pow(digit, 2));
        }
        return totalSum;
    }

}
