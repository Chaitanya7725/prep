public class AverageValueofEvenNumbersThatAreDivisiblebyThree {

    //https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/
    public static void main(String[] args) {
        int[] nums={4,4,9,10};
        System.out.println(averageValue(nums));
    }

    private static int averageValue(int[] nums) {
        int check=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && nums[i]%3==0){
                sum+=nums[i];
                check++;
            }
        }
        if(sum>0)
            return sum/check;
        return 0;
    }

}
