package Strings.easy;

public class AddStrings {

    public static void main(String[] args) {
        String num1="11";
        String num2="123";
        System.out.println(addStrings(num1, num2));//134

        String num3="456";
        String num4= "77";
        System.out.println(addStrings(num3, num4));//533

        String num5="0";
        String num6="0";
        System.out.println(addStrings(num5, num6));//0

        String num7="1";
        String num8="9";
        System.out.println(addStrings(num7, num8));//10

        String num9="9";
        String num10="99";
        System.out.println(addStrings(num9, num10));//108

    }

    private static String addStrings(String num1, String num2) {

        int carry=0;
        int result=0;

        int max=Math.max(num1.length(),num2.length())-1;
        int diff=Math.abs(num1.length()-num2.length());

        String res="";
        String small="";
        String big="";
        if(num1.length()<=num2.length()){
            small=num1;
            big=num2;
        }else{
            small=num2;
            big=num1;
        }
        for (int i = max; i >= 0 ; i--) {
            int ele=i-diff >= 0? small.charAt(i-diff)-'0':0;
            int sum=Integer.valueOf((big.charAt(i)-'0')+ele)+carry;
            if(sum>9){
                carry=sum/10;
                result=sum%10;
                res=result+res;
            }else{
                res=(big.charAt(i)-'0')+(ele+carry)+res;
                carry=0;
            }
        }
        if(carry>0){
            res=carry+res;
            carry=0;
        }
        return res;
    }

}
