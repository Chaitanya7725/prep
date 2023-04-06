package strings;

public class AllAbeforeB {

    public static void main(String[] args) {
        String s="aaabbb";
        System.out.println(checkString(s));//true

        String s1="abab";
        System.out.println(checkString(s1));//false

        String s2="bbb";
        System.out.println(checkString(s2));//true
    }

    private static boolean checkString(String s) {
        return s.indexOf('a',s.indexOf('b')) > 0 ? false :true;
    }


}
