import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrefixScores {

    public static List<Integer> getPrefixScores(List<Integer> arr) {
        List<Integer> output=new ArrayList<>();
        int len=arr.size();
        int currentIndex=0;
        int iteration=1;
        int setValue=0;
        for (int i = 0; i < iteration && i < len; i++) {
            currentIndex=arr.get(i);
            setValue=currentIndex + Collections.max(arr);
            arr.set(i,setValue);
            output.add(setValue);
            iteration++;
            System.out.println(arr);
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
