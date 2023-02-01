package arrays;

import java.util.*;

public class HighFive {

//    https://leetcode.com/problems/high-five/
    public static void main(String[] args) {
        int[][] items={{1,91},{1,92},{1,60},{1,65},{1,87},{1,100},
                {2,93},{2,97},{2,77},{2,100},{2,76}};
        System.out.println(Arrays.toString(highFive(items)));
    }

    private static int[][] highFive(int[][] items) {
        java.util.Arrays.sort(items, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(b[1], a[1]);
            }
        });
        Map<Integer, List<Integer>> records=new HashMap<>();
        int count=0;
        int sum=0;
        for (int [] item:items) {
            if(records.get(item[0])==null)
                records.put(item[0],Arrays.asList(1,item[1]));
            else if(records.get(item[0]).get(0)<5){
                count=(records.get(item[0]).get(0))+1;
                sum=(records.get(item[0]).get(1)+item[1]);
                records.put(item[0],Arrays.asList(count,sum));
            }
        }
//        int[][] arr = records.keySet().stream()
//                .map(l -> records.get(l).stream().mapToInt(Integer::intValue).toArray())
//                .toArray(int[][]::new);
        int[][] arr=new int[records.size()][2];
        int index=0;
        for (Map.Entry<Integer,List<Integer>> entry : records.entrySet()){
            int j=0;
            arr[index][j]=entry.getKey();
            arr[index][j+1]=entry.getValue().get(1)/5;
            index++;
        }
        return arr;
    }

}