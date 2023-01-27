package arrays;

public class CountPositiveNegative {

    public static void main(String[] args) {
//        int[] nums={-2,-1,-1,1,2,3};
        int[] nums={-3,-2,-1,0,0,1,2};
//        int[] nums={5,20,66,1314};
        System.out.println(maximumCount(nums));
    }

    private static int maximumCount(int[] nums) {
        int pos=0,neg=0;
        for (int number : nums) {
            if(number<0)
                neg++;
            else if (number>0)
                pos++;
        }
        return pos > neg ? pos : neg;
    }
}
