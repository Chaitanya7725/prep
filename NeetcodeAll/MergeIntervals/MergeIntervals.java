package MergeIntervals;

import java.util.*;

public class MergeIntervals {

    public static void main(String[] args) {
//        int [][] input=new int[][]{{1,3},{2,6},{8,10},{15,18}};
//        int [][] input=new int[][]{{1,5},{4,6},{7,9},{8,9},{9,10}};
//        int [][] input=new int[][]{{1,3}};
        int [][] input=new int[][]{{1,4},{0,4}};
        System.out.println(Arrays.toString(merge(input)));
    }

    private static int[][] merge(int [][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        LinkedList<ArrayList<Integer>> check = new LinkedList<>();
        check.add(new ArrayList<>(){{
                add(0,intervals[0][0]);
                add(1,intervals[0][1]);
        }});
        for (int i = 1; i < intervals.length; i++) {
            if(check.getLast().get(1)>=intervals[i][0]){
                check.getLast().set(1,Integer.max(check.getLast().get(1),intervals[i][1]));
            }else{
                int finalI = i;
                check.add(new ArrayList<>(){{
                    add(0,intervals[finalI][0]);
                    add(1,intervals[finalI][1]);
                }});
            }
        }
        int [][]res=new int[check.size()][2];
        for (int i = 0; i < res.length; i++) {
            res[i][0]=check.get(i).get(0);
            res[i][1]=check.get(i).get(1);
        }
        return res;
    }
}
