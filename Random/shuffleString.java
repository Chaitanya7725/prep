package Random;

/**
 * shuffleString
 */
public class shuffleString {

    public String restoreString(String s, int[] indices) {
        int length = indices.length;
        char[] array = new char[length];
        char[] schar = s.toCharArray();
        for (int i = 0; i < length; i++) {
            array[indices[i]] = schar[i];
        }
        return String.valueOf(array);
    }

    public static void main(String[] args) {
        shuffleString shuffle = new shuffleString();
        String s = "codeleet";
        int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
        shuffle.restoreString(s, indices);
    }
}