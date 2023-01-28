package arrays;

import java.util.*;

public class MergeSimilarItems {

    public static void main(String[] args) {
        int[][] items1={{1,1},{4,5},{3,8}};
        int[][] items2={{3,1},{1,5}};
        System.out.println(mergeSimilarItems(items1, items2));//[[1,6],[3,9],[4,5]]
        int[][] items3={{1,1},{3,2},{2,3}};
        int[][] items4={{2,1},{3,2},{1,3}};
        System.out.println(mergeSimilarItems(items3, items4));//[[1,4],[2,4],[3,4]]
        int[][] items5={{1,3},{2,2}};
        int[][] items6={{7,1},{2,2},{1,4}};
        System.out.println(mergeSimilarItems(items5, items6));//[[1,7],[2,4],[7,1]]
    }

    private static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ret=new ArrayList<>();
        HashMap<Integer,Integer> records=new HashMap<>();
        for (int i = 0; i < items1.length; i++){
            int count=items1.length>items2.length?items1.length:items2.length;
            for (int j = 0; j < items2.length; j++) {
                if (items1[i][0] == items2[j][0]) {
                    records.put(items1[i][0], (items1[i][1] + items2[j][1]));
                    count--;
                }
            }
        }
        for (int key:records.keySet())
            ret.add(List.of(key,records.get(key)));
        return ret;
    }
}
