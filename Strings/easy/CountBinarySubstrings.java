package Strings.easy;

public class CountBinarySubstrings {

    public static void main(String[] args) {
        String s="00110011";
        System.out.println(countBinarySubstrings(s));//6

        String s1="10101";
        System.out.println(countBinarySubstrings(s1));//4

        String s2="0011100011";
        System.out.println(countBinarySubstrings(s2));//7

        String s3="00110";
        System.out.println(countBinarySubstrings(s3));//3
    }

    private static int countBinarySubstrings(String s) {
        int res=0;
        int curr=1;
        int prev=0;
        for (int i = 1; i < s.length(); i++)
            if(s.charAt(i)==s.charAt(i-1)) {
                curr++;
            }
            else{
                res+=Math.min(curr,prev);
                prev=curr;
                curr=1;
            }
        res+=Math.min(curr,prev);
        return res;
    }

}
