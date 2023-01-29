package arrays;

import com.sun.source.tree.Tree;

import java.util.*;

public class HighestRank {

//    In a special ranking system, each voter gives a rank from highest to lowest to all teams
//    participating in the competition.
//    The ordering of teams is decided by who received the most position-one votes.
//    If two or more teams tie in the first position, we consider the second position to
//    resolve the conflict, if they tie again, we continue this process until the ties are
//    resolved. If two or more teams are still tied after considering all positions,
//    we rank them alphabetically based on their team letter
//    You are given an array of strings votes which is the votes of all voters in the
//    ranking systems. Sort all teams according to the ranking system described above.
//    Return a string of all teams sorted by the ranking


//    Input: votes = ["ABC","ACB","ABC","ACB","ACB"]
//    Output: "ACB"

//    0th=1
//    1st=2
//    2nd=3

    static Map<Character,Integer> records=new HashMap<>();
    public static void main(String[] args) {

//        String [] votes={"BA","BA","AB","AB","AB"};
//        getHighestRank(votes);
//        String [] votes = {"ABC","ACB","ABC","ACB","ACB"};
//        String [] votes={"ABCD","ACBD","ABCD","ACBD","ACBD"};
//        System.out.println(getHighestRank(votes));
//        String [] votes1= {"XYZW","XYZW"};
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
        Object[] a = new Object[0];
        for (String vote : votes)
            for (int i = 0; i < vote.length(); i++){
                records.put(vote.charAt(i),records.getOrDefault(vote.charAt(i),0)+(i+1));
                a = records.entrySet().toArray();
                Arrays.sort(a, new Comparator() {
                    public int compare(Object o1, Object o2) {
                        return ((Map.Entry<Character, Integer>) o1).getValue()
                                .compareTo(((Map.Entry<Character, Integer>) o2).getValue());
                    }
                });
//                System.out.println(i+"->"+records);
                System.out.println(i+"->"+Arrays.toString(a));
            }

//        Object[] a = records.entrySet().toArray();
//        Arrays.sort(a, new Comparator() {
//            public int compare(Object o1, Object o2) {
//                return ((Map.Entry<Character, Integer>) o1).getValue()
//                        .compareTo(((Map.Entry<Character, Integer>) o2).getValue());
//            }
//        });

        for (Object e : a)
            highestRank+=((Map.Entry<Character, Integer>) e).getKey();
        return highestRank;
    }


}
