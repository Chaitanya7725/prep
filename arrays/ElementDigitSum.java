package arrays;
//https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/
public class ElementDigitSum {

    public static void main(String[] args) {
        int[] nums=new int[]{1,15,6,3};
        int difference=differenceOfSum(nums);
        System.out.println(difference);
    }

    public static int differenceOfSum(int[] nums){

        int elementSum=0;
        int digitSum=0;
        String integer="";
        for(int i:nums){
            elementSum+=i;
            if(i>9){
                integer=String.valueOf(i);
                for (int j = 0; j < integer.length(); j++) {
//                    System.out.print(Integer.valueOf(Character.toString(integer.charAt(j)))+" ");
                    digitSum+=Integer.valueOf(Character.toString(integer.charAt(j)));
                }
//                System.out.println();
            }else{
                digitSum+=i;
            }

        }
        return elementSum-digitSum;
    }
}
