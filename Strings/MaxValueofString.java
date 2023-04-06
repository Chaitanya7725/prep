package strings;

import java.util.regex.Pattern;

public class MaxValueofString {

    public static void main(String[] args) {
        String[] strs={"alic3","bob","3","4","00000"};
        System.out.println(maximumValue(strs));//5

        String[] strs1={"1","01","001","0001"};
        System.out.println(maximumValue(strs1));//1

        String[] strs2={"772","0l","98269","5","to06","lwod1","31939","230","i08x"};
        System.out.println(maximumValue(strs2));//98269
    }

//    regex using Pattern compile matcher and find
//    https://www.w3schools.com/java/java_regex.asp
    private static int maximumValue(String[] strs) {
        int length=0;
        for (String words : strs) {
            boolean contains=Pattern.compile("[a-z]").matcher(words).find();
            if(contains){
                if(words.length()>length)
                    length=words.length();
            }else{
                int temp=Integer.parseInt(words);
                if(temp>length)
                    length=temp;
            }
        }
        return length;
    }
}

