//package arrays;
//
//import java.util.ArrayList;
//import java.util.List;
//
////https://leetcode.com/problems/count-items-matching-a-rule/
//public class matchingRule {
//    public static void main(String[] args) {
//        matchingRule m = new matchingRule();
//        List<List<String>> items = new ArrayList<>() {
//            {
//                add("phone");
//                add("blue");
//                add("pixel");
//            }
//            ;
//            {
//                add("computer");
//                add("silver");
//                add("lenovo");
//            };
//            {
//                add("phone");
//                add("gold");
//                add("iphone");
//            }
//        };
//        String ruleKey = "color";
//        String ruleValue = "silver";
//        m.countMatches(items, ruleKey, ruleValue);
//    }
//
//    public int countMatches(List<List<String>> items, String ruleKey, String
//            ruleValue) {
//        int size = items.size();
//        int count = 0;
//        int status = 0;
//        if (ruleKey.equals("color")) {
//            status = 1;
//        } else if (ruleKey.equals("name")) {
//            status = 2;
//        }
//        for (int i = 0; i < size; i++) {
//            for (int j = status; j <= status; j++) {
//                if (items.get(i).get(j).equals(ruleValue)) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//}
