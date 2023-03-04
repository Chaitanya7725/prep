package strings;

public class ReplaceDigitsWithCharacters {

    public static void main(String[] args) {
        String s="a1c1e1";//abcdef
        System.out.println(replaceDigits(s));
        String s1="a1b2c3d4e";//abbdcfdhe
        System.out.println(replaceDigits(s1));
    }

    private static String replaceDigits(String s) {
        String result="";
        for (int i = 1; i < s.length(); i+=2) {
            int number=Integer.parseInt(String.valueOf(s.charAt(i)));
            char character=s.charAt(i-1);
            result+=character;
            result+=(character+=number);
        }
        if(s.length()%2!=0)
            result+=s.charAt(s.length()-1);
        return result;
    }
}
