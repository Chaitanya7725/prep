package Strings;

public class MinimumTimeSpecialTypewriter {

    static String alpha="abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        String word="bz";
        System.out.println(minTimeToType(word));
    }

    private static int minTimeToType(String word) {
        int clockWise=0;
        int antiClockWise=0;
        for (int i = 1; i < word.length(); i++) {
            System.out.println(word.charAt(i-1)<word.charAt(i));
            clockWise=(26+alpha.indexOf(word.charAt(i-1)))-alpha.indexOf(word.charAt(i));
            antiClockWise=alpha.indexOf(word.charAt(i))-(26+alpha.indexOf(word.charAt(i-1)));
            System.out.println(clockWise+antiClockWise);
        }
        return clockWise+antiClockWise;

    }

}
