package arrays;

public class NumberofEvenNumber {

    public static void main(String[] args) {
//        Chaitanya: Used Math.log10
//        https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
        int [] number={12,345,2,6,7896};
        System.out.println(findNumbers(number));
    }

    private static int findNumbers(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if((int)(Math.log10(nums[i])+1) %2==0)
                count++;
        }
        return count;
    }

}
