package strings;

public class RemovePalindromic {

    public static void main(String[] args) {
        String s="ababa";
        System.out.println(removePalindromeSub(s));//1

        String s1="abb";
        System.out.println(removePalindromeSub(s1));//2

        String s2="baabb";
        System.out.println(removePalindromeSub(s2));//2

    }

    private static int removePalindromeSub(String s) {
        if(s.length()==0) return 0;
        int i=0;
        int j=s.length()-1;
        while(i<j)
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else return 2;
        return 1;
    }
}
