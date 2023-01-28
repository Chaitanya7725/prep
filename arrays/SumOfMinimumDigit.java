package arrays;

public class SumOfMinimumDigit {

//    https://leetcode.com/problems/sum-of-digits-in-the-minimum-number/
//    Chaitanya
    public static void main(String[] args) {
//        int [] nums={34,23,1,24,75,33,54,8};
        int [] nums={99,77,33,66,55};
        System.out.println(sumOfDigits(nums));
    }

    private static int sumOfDigits(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
            if(nums[i]<min)
                min=nums[i];
        StringBuilder sb=new StringBuilder(min);
        sb.append(min);
        String string=sb.toString();
        int sum=0;
        for(int i=0;i<string.length();i++)
            sum+=Character.getNumericValue(string.charAt(i));
        return sum%2==0 ? 1 : 0;
    }

}
