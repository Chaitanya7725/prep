// import java.util.List;

// public class matchingRule {
// public int countMatches(List<List<String>> items, String ruleKey, String
// ruleValue) {
// int size = items.size();
// int count = 0;
// int status = 0;
// if (ruleKey.equals("color")) {
// status = 1;
// } else if (ruleKey.equals("name")) {
// status = 2;
// }
// for (int i = 0; i < size; i++) {
// for (int j = status; j <= status; j++) {
// if (items.get(i).get(j).equals(ruleValue)) {
// count++;
// }
// }
// }
// return count;
// }

// public static void main(String[] args) {
// matchingRule m = new matchingRule();
// List<List<String>> items = new ArrayList<ArrayList<String>>(){
// ["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]
// };
// String ruleKey = "color";
// String ruleValue = "silver";
// m.countMatches(items, ruleKey, ruleValue);
// }
// }
