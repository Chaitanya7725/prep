// Write a function, uncompress, that takes in a string as an argument. The input string will be formatted into multiple groups according to the following pattern:
// <number><char>
// for example, '2c' or '3a'.
// The function should return an uncompressed version of the string where each 'char' of a group is repeated 'number' times consecutively. You may assume that the input string is well-formed according to the previously mentioned pattern.

// test_00:
// uncompress("2c3a1t"); // -> 'ccaaat'
// test_01:
// uncompress("4s2b"); // -> 'ssssbb'
// test_02:
// uncompress("2p1o5p"); // -> 'ppoppppp'
public class decode {

    // private static int getNumber(String ops, int i) {
    // String number = String.valueOf(ops.charAt(i));
    // if (String.valueOf(ops.charAt(i + 1)))
    // return 0;
    // }

    public static void main(String[] args) {
        // String ops = "2c3a1t";
        String ops = "45s2b";
        // String ops = "2p";
        // String ops = "2p1o5p";

        String result = "";
        for (int i = 0; i < ops.length(); i += 2) {
            int x = 0;
            if (Integer.valueOf(String.valueOf(ops.charAt(i + x))) > 0) {
                System.out.println("More");
            }
            int iterate = Integer.valueOf(String.valueOf(ops.charAt(i)));
            for (int j = 0; j < iterate; j++) {
                result += ops.charAt(i + 1);
            }
        }
        System.out.println(result);
    }

}
