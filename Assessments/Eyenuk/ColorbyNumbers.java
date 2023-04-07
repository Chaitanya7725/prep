package Assessments.Eyenuk;

import java.util.HashMap;
import java.util.Map;

public class ColorbyNumbers {

    public static void main(String[] args) {
        String [] input={"RRCCCCCCCYYYRRRRRR","CCCCCCCRRBBYYY"};//"90,100"
        System.out.println(ColorByNumbers(input));

        String [] input1={"RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR","R"};
        System.out.println(ColorByNumbers(input1));

        String [] input2={"C",""};
        System.out.println(ColorByNumbers(input2));

        String [] input3={"RRRRR","RRRRR","RRRRR","RRRRR","RRRRR","R"};
        System.out.println(ColorByNumbers(input3));
    }

    private static String ColorByNumbers(String[] input){
        int usage=5;
        int dull=30;
        int empty=60;
        String result="";
        int dullCount=0;
        int emptyCount=0;
        Map<Character,Integer> recGlobal=new HashMap<>();
        Map<Character,Integer> recLocal = null;
        for (String in : input) {
            recLocal=new HashMap<>();
            for (char ch:in.toCharArray()) {
                recLocal.put(ch,recLocal.getOrDefault(ch,0)+1);
                recGlobal.put(ch,recGlobal.getOrDefault(ch,0)+1);
            }
            int count=0;
            for (char c:recLocal.keySet())
                count+=recLocal.get(c);
            for (char c:recGlobal.keySet()){
                if(recGlobal.get(c)>10) {
                    dullCount=recGlobal.get(c)/10;
                    if(dullCount>5){
                        emptyCount=dullCount/5;
                    }
                }
            }
            result+=(count*usage+dullCount*dull+emptyCount*empty)+",";
        }
        return result.substring(0,result.length()-1);
    }

}
