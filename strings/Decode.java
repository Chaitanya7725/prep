package strings;

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
public class Decode {
    public static void main(String[] args) {
        // String ops = "2c3a1t";
        // String ops = "2p";
        // String ops = "2p1o5p";
        // String ops = "45s2b";
        String ops = "2s45b";
        String result = "";
        String[] arr1 = ops.split("[0-9]");
        String[] arr2 = ops.split("[a-z]");
        int x = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].trim() != "") {
                result += arr1[i].repeat(Integer.valueOf(arr2[x]));
                x++;
            }
        }
        System.out.println(result);
    }
}