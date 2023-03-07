package arrays.easy;

public class LemonadeChange {
    public static void main(String[] args) {
        int[] bills={5,5,5,10,20};
        System.out.println(lemonadeChange(bills));

        int[] bills1={5,5,10,10,20};
        System.out.println(lemonadeChange(bills1));
    }
    private static boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        for (int i = 0; i < bills.length; i++) {
            if(bills[i]==5)
                five++;
            else if (bills[i]==10) {
                ten++;
                five--;
            } else if (ten>0) {
                ten--;
                five--;
            } else
                five-=3;
            if(five<0)
                return false;
        }
        return true;
    }

}
