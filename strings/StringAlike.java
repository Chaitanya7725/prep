package strings;

public class StringAlike {

    public static void main(String[] args) {
        String s="book";
        System.out.println(halvesAreAlike(s));//true
        String s1="textbook";
        System.out.println(halvesAreAlike(s1));//false
    }

    private static boolean halvesAreAlike(String s) {
        String a=s.substring(0,s.length()/2);
        String b=s.substring(s.length()/2);
        int count=0;
        for (int i = 0; i < a.length(); i++) {
            String aChar=String.valueOf(a.charAt(i));
            String bChar=String.valueOf(b.charAt(i));
            if(aChar.equalsIgnoreCase("a") || aChar.equalsIgnoreCase("e") || aChar.equalsIgnoreCase("i") ||
                    aChar.equalsIgnoreCase("o") || aChar.equalsIgnoreCase("u"))
                count++;
            if(bChar.equalsIgnoreCase("a") || bChar.equalsIgnoreCase("e") || bChar.equalsIgnoreCase("i") ||
                    bChar.equalsIgnoreCase("o") || bChar.equalsIgnoreCase("u"))
                count--;
        }
        if(count==0)
            return true;
        return false;
    }

}
