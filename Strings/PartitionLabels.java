package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels {

    public static void main(String[] args) {
        String s="ababcbacadefegdehijhklij";
        System.out.println(partitionLabels(s));
    }

    private static List<Integer> partitionLabels(String s) {
        int start=0,end=0;
        Map<Character,Integer> records=new HashMap<>();
        for (char alpha : s.toCharArray()) {
            records.put(alpha,s.lastIndexOf(alpha));
        }
        System.out.println(records);
//        for (int i = 0; i < s.length(); i++) {
//            s.indexOf(s.charAt(i))
//        }
        return new ArrayList<>(){};
    }
}
