package strings;

public class SubstringsofSize3 {

    public static void main(String[] args) {
        String s="xyzzaz";
        System.out.println(countGoodSubstrings(s));

        String s1="ab";
        System.out.println(countGoodSubstrings(s1));
    }

    private static int countGoodSubstrings(String s) {
        int count=0;
        for (int i = 1; i < s.length()-1; i++)
            if(s.charAt(i-1)!=s.charAt(i) && s.charAt(i)!=s.charAt(i+1) && s.charAt(i-1)!=s.charAt(i+1))
                count++;
        return count;
    }
}
