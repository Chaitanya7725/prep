package strings;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortStringArray {
    //used String.join method to join the map values with space in between
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    private static String sortSentence(String s) {
        String [] splited=s.split(" ");
        SortedMap<Integer,String> sortedMap = new TreeMap<>();
        for (String split : splited)
            sortedMap.put(Integer.valueOf(split.substring(split.length()-1)),split.substring(0,split.length()-1));
        return String.join(" ",sortedMap.values());
    }

}
