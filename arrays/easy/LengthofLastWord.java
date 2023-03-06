package arrays.easy;

public class LengthofLastWord {

    public static void main(String[] args) {
        String s="Hello World";
        System.out.println(lengthOfLastWord(s));
        String s1="   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s1));
        String s2="luffy is still joyboy";
        System.out.println(lengthOfLastWord(s2));
        String s3="a";
        System.out.println(lengthOfLastWord(s3));
        String s4="    day";
        System.out.println(lengthOfLastWord(s4));
    }

    private static int lengthOfLastWord(String s) {
        s=s.trim();
        if(s.length()==1) return 1;
        if(!s.contains(" ")) return s.length();
        return s.substring(s.lastIndexOf(" ")).length()-1;
    }

}
