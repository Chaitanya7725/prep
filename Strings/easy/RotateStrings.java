package Strings.easy;

public class RotateStrings {

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s,goal));

        String s1 = "abcde";
        String goal1 = "abced";
        System.out.println(rotateString(s1,goal1));

        String s2 = "abcde";
        String goal2 = "bcdea";
        System.out.println(rotateString(s2,goal2));

    }

    private static boolean rotateString(String s, String goal) {
        return (s.length()==goal.length() && (s+s).contains(goal));
    }

}