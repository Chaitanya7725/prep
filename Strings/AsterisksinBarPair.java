package strings;

public class AsterisksinBarPair {

    public static void main(String[] args) {

        String s="l|*e*et|c**o|*de|";
        System.out.println(countAsterisks(s));
        String s1="iamprogrammer";
        System.out.println(countAsterisks(s1));

    }

    private static int countAsterisks(String s) {

        int asteriskCount=0;
        int barCount=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='|')
                barCount++;
            else if (barCount%2==0 && s.charAt(i)=='*')
                asteriskCount++;
        }
        return asteriskCount;
    }

}
