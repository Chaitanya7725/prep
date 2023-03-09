package arrays.easy;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IndexPairsofString {

    public static void main(String[] args) {
        String text="thestoryofleetcodeandme";
        String[] words={"story","fleet","leetcode"};
//        for (int[] array:indexPairs(text, words)) {
//            System.out.print(Arrays.toString(array));//[3,7],[9,13],[10,17]
//        }

        String text1="ababa";
        String[] words1={"aba","ab"};
//        for (int[] array:indexPairs(text1, words1)) {
//            System.out.print(Arrays.toString(array));//[[0,1],[0,2],[2,3],[2,4]]
//        }
        String text2="aaaabaabab";
        String[] words2={"baa","ba","abab","abb","aa","bb","abba","bbba","ab","aaba"};
        for (int[] array:indexPairs(text2, words2)) {
            System.out.print(Arrays.toString(array));//[[0,1],[1,2],[2,3],[2,5],[3,4],[4,5],[4,6],[5,6],[5,8],[6,7],[6,9],[7,8],[8,9]]
        }

    }

    private static int[][] indexPairs(String text, String[] words) {
        List<List<Integer>> rec=new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            Pattern pattern = Pattern.compile("(?=("+words[i]+"))");
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                int first=matcher.start();
                int second=matcher.start()+words[i].length()-1;
                rec.add(new ArrayList<>(){{add(first);add(second);}});
            }
        }

        Collections.sort(rec, new Comparator<List<Integer>>() {
            public int compare(List<Integer> a, List<Integer> b) {
                if (a.get(0).compareTo(b.get(0)) == 0) {
                    return a.get(1).compareTo(b.get(1));
                }
                return a.get(0).compareTo(b.get(0));
            }
        });

        int[][] res = new int[rec.size()][2];
        for (int i = 0; i < rec.size(); i++) {
            res[i][0]=rec.get(i).get(0);
            res[i][1]=rec.get(i).get(1);
        }
        return res;
    }
}
