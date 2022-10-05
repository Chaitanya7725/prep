public class jewelsStones {

    public static int numJewelsInStones(String jewels, String stones) {
        // System.out.println(stones.matches("(.*)"+jewels"+(.*)"));
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
        String jewels = "aAcCd";
        String stones = "aAbbCcDDdbabA";
        int res = numJewelsInStones(jewels, stones);
        System.out.println(res);
    }
}