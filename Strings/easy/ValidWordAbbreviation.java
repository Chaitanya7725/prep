package Strings.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidWordAbbreviation {

    public static void main(String[] args) {
        String word="internationalization";
        String abbr="i12iz4n";
        System.out.println(validWordAbbreviation(word,abbr));
    }

    private static boolean validWordAbbreviation(String word, String abbr) {
        List<Integer> records=new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(abbr);
        while(matcher.find())
            records.add(Integer.valueOf(matcher.group()));
        int count1=0;
        int count2=0;
        for(int i=0;i<records.size();i++){
            count1+=abbr.indexOf(String.valueOf(records.get(i)));
            System.out.println(count1+abbr.indexOf(String.valueOf(records.get(i)))+" "+(count2+records.get(i)));
            count2+=records.get(i);
        }
        return false;
    }
}
