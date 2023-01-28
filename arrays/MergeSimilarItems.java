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
        int[][] items7={{15,5},{2,6},{5,3},{14,8},{12,4},{19,6},{25,4},{13,4},{9,1}};
        int[][] items8={{15,9},{2,4},{5,2},{14,4},{12,3},{19,10},{25,7},{13,6},{9,9}};
        System.out.println(mergeSimilarItems(items7, items8));//[[2,10],[5,5],[9,10],[12,7],[13,10],[14,12],[15,14],[19,16],[25,11]]
    }

    private static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ret=new ArrayList<>();
        SortedMap<Integer,Integer> records=new TreeMap<>();
        int largerItem=items1.length>items2.length? 1 : 2;
        if(largerItem==1)
            for (int i = 0; i < items1.length; i++)
                records.put(items1[i][0],items1[i][1]);
        else
            for (int i = 0; i < items2.length; i++)
                records.put(items2[i][0],items2[i][1]);

        if(largerItem==1)
            for (int i = 0; i < items2.length; i++)
                records.put(items2[i][0],records.getOrDefault(items2[i][0],0)+items2[i][1]);
        else
            for (int i = 0; i < items1.length; i++)
                records.put(items1[i][0],records.getOrDefault(items1[i][0],0)+items1[i][1]);
        for (int key:records.keySet())
            ret.add(List.of(key,records.get(key)));
        return ret;
    }
}
