import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class uniqueNoofOccurences {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> check = new HashSet<>();
        int counter = 0;
        boolean status = false;
        for (int i = 0; i < arr.length; i++) {
            status = false;
            if (map.containsKey(arr[i])) {
                counter = map.get(arr[i]);
                counter++;
            } else {
                counter = 1;
            }
            check.add(counter);
            check.forEach(System.out::println);
            if (check.contains(counter)) {
                // System.out.println("not");
                return false;
            } else {
                // System.out.println("unique");
                status = true;
            }
            // else {
            // status = true;
            // check.add(counter);
            // }
            // System.out.print(counter + " ");
        }
        return status;
    }

    public static void main(String[] args) {
        uniqueNoofOccurences u = new uniqueNoofOccurences();
        int[] arr = { 1, 2, 2, 1, 1, 3 };// unique
        // int[] arr = { 1, 2 };// not
        // int[] arr = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };// unique
        // System.out.println(
        u.uniqueOccurrences(arr);
    }
}
