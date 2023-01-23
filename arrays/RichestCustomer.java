package arrays;

//https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomer {

    public static void main(String[] args) {
        int[][] accounts=new int[][]{{1,2,3},{3,2,1}};
        int result=maximumWealth(accounts);
        System.out.println(result);
    }

    public static int maximumWealth(int[][] accounts) {
        int max=0;
        for(int[] wealth:accounts){
            int individual=0;
            for (int i = 0; i < wealth.length; i++) {
                individual+=wealth[i];
            }
            max=Integer.max(max,individual);
        }
        return max;
    }

}
