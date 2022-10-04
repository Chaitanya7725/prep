import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class cutTheSticks {

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        result.add(arr.size());
        while (arr.size() > 1 && (Collections.min(arr) - Collections.max(arr)) != 0
                && (Collections.min(arr) + Collections.max(arr)) > 0) {
            int min = Collections.min(arr);
            for (int i = 0; i < arr.size(); i++) {
                arr.set(i, arr.get(i) - min);
            }
            while (arr.contains(0)) {
                arr.remove(Collections.min(arr));
            }
            System.out.println(arr);
            result.add(arr.size());
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        // Integer[] input = { 5, 4, 4, 2, 2, 8 };
        Integer[] input = { 8, 8, 14, 10, 3, 5, 14, 12 };
        arr.addAll(Arrays.asList(input));
        result = cutTheSticks(arr);
        System.out.println(result);
    }
}
