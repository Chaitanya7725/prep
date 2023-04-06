package arrays.easy;

import java.util.*;

public class CountPairsOfSimilarStrings {

    public static void main(String[] args) {
        String[] words={"aba","aabb","abcd","bac","aabc"};
        System.out.println(similarPairs(words));//2

        String[] words1={"aabb","ab","ba"};
        System.out.println(similarPairs(words1));//3

        String[] words2={"nba","cba","dba"};
        System.out.println(similarPairs(words2));//0

        String[] words3={"zxca","zxc"};
        System.out.println(similarPairs(words3));//3

        String[] words4={"dcedceadceceaeddcedc","dddcebcedcdbaeaaaeab","eecbeddbddeadcbbbdbb","decbcbebbddceacdeadd","ccbddbaedcadedbcaaae","dddcaadaceaedcdceedd","bbeddbcbbccddcaceeea","bdabacbbdadabbbddaea"};
        System.out.println(similarPairs(words4));//16
    }

    private static int similarPairs(String[] words) {
        Map<String,Integer> archive=new HashMap<>();
        SortedSet<String> records;
        for (String word:words) {
            records=new TreeSet<>();
            for (char alpha:word.toCharArray())
                records.add(String.valueOf(alpha));
            String sorted=String.join("",records);
            archive.put(sorted,archive.getOrDefault(sorted,0)+1);
        }
        System.out.println(archive);
        return archive.values().size()==1 ? archive.entrySet().iterator().next().getValue():(int)archive.values().stream().filter(c->c>1).count();
    }

}
