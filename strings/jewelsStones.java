package strings;

public class jewelsStones {

    //https://leetcode.com/problems/jewels-and-stones/
    // Approach 1
    public static int numJewelsInStones(String jewels, String stones) {
        int counter = 0;
        for (int i = 0; i < jewels.length(); i++) {
            int index = stones.indexOf(String.valueOf(jewels.charAt(i)));
            while (index != -1) {
                counter++;
                index = stones.indexOf(String.valueOf(jewels.charAt(i)), index + 1);
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));

        String jewels1 = "z";
        String stones1 = "ZZ";
        System.out.println(numJewelsInStones(jewels1, stones1));

    }
}