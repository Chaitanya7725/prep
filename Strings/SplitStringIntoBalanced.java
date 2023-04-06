package Strings;

public class SplitStringIntoBalanced {

    public static void main(String[] args) {
        String s="RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
        String s1="RLRRRLLRLL";
        System.out.println(balancedStringSplit(s1));
    }

    static private int balancedStringSplit(String s) {
        int balancedCount=0;
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='L')
                count++;
            else if (s.charAt(i)=='R')
                count--;

            if(count==0)
                balancedCount++;
        }
        return balancedCount;

    }


}
