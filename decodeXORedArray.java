public class decodeXORedArray {
    public int[] decode(int[] encoded, int first) {
        int length = encoded.length;
        int[] original = new int[length + 1];
        original[0] = first;
        String one = Integer.toBinaryString(3);
        String two = Integer.toBinaryString(5);
        int blen = one.length();
        System.out.println(one);
        System.out.println(two);
        for (int i = blen - 1; i >= 0; i--) {
            // System.out.print(Integer.valueOf(one.charAt(i)) + " ");
            System.out.println(one.charAt(i) + " XOR " + two.charAt(i) + " = " + (one.charAt(i) ^ two.charAt(i)));
        }
        // System.out.println(one ^ two);
        // for (int i = 0; i < length; i++) {
        // original[i + 1] = encoded[i] - original[i];
        // first = original[i + 1];
        // }
        // System.out.print(encoded[0]-original[0]);
        // first=encoded[0]-original[0];
        // System.out.println(encoded[1]-first);
        // first=encoded[1]-first;
        // System.out.println(encoded[2]-first);
        return original;
    }

    public static void main(String[] args) {
        decodeXORedArray d = new decodeXORedArray();
        int[] encoded = { 6 };
        int first = 1;
        d.decode(encoded, first);
    }

}
