package strings;

import java.util.Arrays;

public class DecryptString {

    //While replacing String.valueOf used here or use the +"" to convert char into string
    public static void main(String[] args) {
//        String s="10#11#12";//jkab
        String s="1326#";//acz
        System.out.println(freqAlphabets(s));
    }

    private static String freqAlphabets(String s) {
//        int index=0;
//        String sub=s;
//        for (int i = 0; i < sub.length(); i++) {
//            System.out.println(sub.charAt(sub.indexOf('#')-2)+""+sub.charAt(sub.indexOf('#')-1));
//            index=sub.indexOf('#');
//            sub=sub.substring(index+1);
//        }
        if(s.contains("#"))
            for (int i = 10; i <= 26; i++)
                s=s.replaceAll(i + "#",(char)('a'+(i-1))+"");
//                s=s.replaceAll(i + "#", String.valueOf((char)('a'+(i-1))));
        for (int i = 1; i <= 9; i++)
            s=s.replaceAll(i + "",(char)('a'+(i-1))+"");
//            s=s.replaceAll(i + "", String.valueOf((char)('a'+(i-1))));
        return s;
    }

}
