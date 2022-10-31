import java.util.*;

public class MostPopularVideoCreator {

    //https://leetcode.com/problems/most-popular-video-creator/
    public static List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        Map<String,Integer> check=new HashMap<>();
        List<List<String>> output=new ArrayList<>();
        int i=0;
        for (String instance:creators) {
            if(!check.containsKey(instance))
                check.put(instance,views[i]);
            else
                check.put(instance,check.get(instance)+views[i]);
            i++;
        }
        String[] max={"0","0"};
        int m=0;
        int j=0;
        for (String key : check.keySet()) {
            int value=check.get(key);
            if(value > m)
                output.clear();
            max[0]=key;
            max[1]=ids[Arrays.asList(creators).indexOf(key)];
            m=value;
            output.add(List.of(max));
            j++;
        }
        return output;
    }

    public static void main(String[] args) {
//        String[] creators={"alice","bob","alice","chris"};
//        String[] ids={"one","two","three","four"};
//        int[] views={5,10,5,4};
        String[] creators={"alice","alice","alice"};
        String[] ids={"a","b","c"};
        int[] views={1,2,2};
        System.out.println(
                mostPopularCreator(creators,ids,views)
        );
    }
}
