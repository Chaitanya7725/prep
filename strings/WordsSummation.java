package strings;

public class WordsSummation {

    static String alpha="abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        String firstWord="acb";
        String secondWord="cba";
        String targetWord="cdb";
        System.out.println(isSumEqual(firstWord, secondWord, targetWord));

        String firstWord1="aaa";
        String secondWord1="a";
        String targetWord1="aab";
        System.out.println(isSumEqual(firstWord1, secondWord1, targetWord1));
    }

    private static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int l1=firstWord.length();
        int l2=secondWord.length();
        int l3=targetWord.length();
        String fcount="";
        String scount="";
        String tcount="";
        for (int i = 0; i < Math.max(Math.max(l1,l2),l3); i++) {
            fcount+= i<firstWord.length() ? alpha.indexOf(String.valueOf(firstWord.charAt(i))) : "";
            scount+= i<secondWord.length() ? alpha.indexOf(String.valueOf(secondWord.charAt(i))) : "";
            tcount+= i<targetWord.length() ? alpha.indexOf(String.valueOf(targetWord.charAt(i))) : "";
        }
        if((Integer.parseInt(fcount)+Integer.parseInt(scount))==Integer.parseInt(tcount))
            return true;
        return false;
    }


}
