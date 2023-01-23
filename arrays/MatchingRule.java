package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/count-items-matching-a-rule/
public class MatchingRule {

    public static void main(String[] args) {
        MatchingRule m = new MatchingRule();
        List<List<String>> items = new ArrayList<>() {
            {
                add(Arrays.asList("phone", "phone","pixel"));
                add(Arrays.asList("computer", "silver","lenovo"));
                add(Arrays.asList("phone", "gold","iphone"));
            };
        };
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(m.countMatches(items, ruleKey, ruleValue));
    }

    public int countMatches(List<List<String>> items, String ruleKey, String
            ruleValue) {
        int size = items.size();
        int count = 0;
        int status = 0;
        if (ruleKey.equals("color")) {
            status = 1;
        } else if (ruleKey.equals("name")) {
            status = 2;
        }
        for (int i = 0; i < size; i++) {
            for (int j = status; j <= status; j++) {
                if (items.get(i).get(j).equals(ruleValue)) {
                    count++;
                }
            }
        }
        return count;
    }
}