package arrays;

import com.sun.source.tree.Tree;

import java.util.*;

public class HighestRank {

    public static void main(String[] args) {

//        String [] votes = {"ABC","ACB","ABC","ACB","ACB"};//ACB
//        System.out.println(getHighestRank(votes));
//        String [] votes1= {"XYZW","XYZW"};//"XWYZ"
//        System.out.println(getHighestRank(votes1));
        String [] votes2={"FVSHJIEMNGYPTQOURLWCZKAX","AITFQORCEHPVJMXGKSLNZWUY","OTERVXFZUMHNIYSCQAWGPKJL",
                "VMSERIJYLZNWCPQTOKFUHAXG","VNHOZWKQCEFYPSGLAMXJIUTR","ANPHQIJMXCWOSKTYGULFVERZ","RFYUXJEWCKQOMGATHZVILNSP",
                "SCPYUMQJTVEXKRNLIOWGHAFZ","VIKTSJCEYQGLOMPZWAHFXURN","SVJICLXKHQZTFWNPYRGMEUAO","JRCTHYKIGSXPOZLUQAVNEWFM",
                "NGMSWJITREHFZVQCUKXYAPOL","WUXJOQKGNSYLHEZAFIPMRCVT","PKYQIOLXFCRGHZNAMJVUTWES","FERSGNMJVZXWAYLIKCPUQHTO",
                "HPLRIUQMTSGYJVAXWNOCZEKF","JUVWPTEGCOFYSKXNRMHQALIZ","MWPIAZCNSLEYRTHFKQXUOVGJ","EZXLUNFVCMORSIWKTYHJAQPG",
                "HRQNLTKJFIEGMCSXAZPYOVUW","LOHXVYGWRIJMCPSQENUAKTZF","XKUTWPRGHOAQFLVYMJSNEIZC","WTCRQMVKPHOSLGAXZUEFYNJI"};
        System.out.println(getHighestRank(votes2));//VWFHSJARNPEMOXLTUKICZGYQ
    }

    private static String getHighestRank(String[] votes) {
        String highestRank="";
        Map<Character,Integer> records=new HashMap<>();
        for (String vote : votes){
            for (int i = 0; i < vote.length(); i++)
                records.put(vote.charAt(i),records.getOrDefault(vote.charAt(i),0)+i);
        }
        System.out.println(records);
//        Object[] a = records.entrySet().toArray();
//        Arrays.sort(a, new Comparator() {
//            public int compare(Object o1, Object o2) {
//                return ((Map.Entry<Character, Integer>) o2).getValue()
//                        .compareTo(((Map.Entry<Character, Integer>) o1).getValue());
//            }
//        });
//        for (Object e : a)
//            highestRank+=((Map.Entry<Character, Integer>) e).getKey();
        return highestRank;
    }


}
