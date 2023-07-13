package MergeIntervals;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {

    public static void main(String[] args) {
//        int [][] input=new int[][]{{1,3},{2,6},{8,10},{15,18}};
//        int [][] input=new int[][]{{1,5},{4,6},{7,9},{8,9},{9,10}};
//        int [][] input=new int[][]{{1,3}};
        int [][] input=new int[][]{{1,4},{0,4}};
        System.out.println(Arrays.toString(merge(input)));
    }

    private static int[][] merge(int [][] intervals) {
        if(intervals.length<2)
            return intervals;
        LinkedList<ArrayList<Integer>> arrLL = new LinkedList<>();
        for (int i = 1; i < intervals.length; i++) {
            int first0=intervals[i-1][0];
            int first1=intervals[i-1][1];
            int second0=intervals[i][0];
            int second1=intervals[i][1];
            if(i==1){
                if(first1 >= second0){
                    arrLL.add(new ArrayList<>(){
                        {
                            add(0,first0);
                            add(1,second1);
                        }
                    });
                }else{
                    arrLL.add(new ArrayList<>(){
                        {
                            add(0,first0);
                            add(1,first1);
                        }
                    });
                    arrLL.add(new ArrayList<>(){
                        {
                            add(0,second0);
                            add(1,second1);
                        }
                    });
                }
            }else{
                if(arrLL.getLast().get(1) >= second0){
                    arrLL.getLast().add(1,second1);
                    arrLL.getLast().remove(arrLL.getLast().size()-1);
                }else{
                    arrLL.add(new ArrayList<>(){
                        {
                            add(0,Integer.min(first0,first1));
                            add(1,Integer.max(second0,second1));
                        }
                    });
                }
            }
        }
        int [][] res=new int[arrLL.size()][2];
        for (int i = 0; i < res.length; i++) {
            res[i][0]=arrLL.get(i).get(0);
            res[i][1]=arrLL.get(i).get(1);
        }
        return res;
    }
}
