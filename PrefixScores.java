import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrefixScores {

    public static List<Integer> getPrefixScores(List<Integer> arr) {
        List<Integer> output=new ArrayList<>();
        int len=arr.size();
        List<Integer> checkList=new ArrayList<>();
        for (int i = 0; i < len; i++) {
            int currentValue=arr.get(i);
            checkList.add(currentValue);
            int iteration=0;
            List<Integer> cloned_list = new ArrayList<>(checkList);
            for (Integer in : cloned_list) {
                cloned_list.set(iteration,in+Collections.max(cloned_list));
                iteration++;
            }
            output.add(cloned_list.stream().reduce(0, (a, b) -> a + b));
        }
        return output;
    }

    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(getPrefixScores(arr));
    }

}
