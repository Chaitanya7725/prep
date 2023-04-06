package Random;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {

        Pattern pattern =Pattern.compile("\\d");
        Matcher matcher=pattern.matcher("12345");
        System.out.println(matcher.find());

    }

}
