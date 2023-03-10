package arrays.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeleteGreatestValue {

    public static void main(String[] args) {
        int[][] grid=new int[][]{{1,2,4},{3,3,1}};
        System.out.println(deleteGreatestValue(grid));

        int[][] grid1=new int[][]{{10}};
        System.out.println(deleteGreatestValue(grid1));

    }

    private static int deleteGreatestValue(int[][] grid) {
        int count=0;
        List<Integer> res=new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            List<Integer> n=new ArrayList<>();
            for (int j = 0; j < grid[i].length; j++)
                n.add(grid[i][j]);
            list.add(n);
        }
        while(list.get(0).size() > 0){
            for (int i = 0; i < list.size(); i++) {
                int max=Collections.max(list.get(i));
                res.add(max);
                list.get(i).remove(Integer.valueOf(max));
            }
            count+=Collections.max(res);
            res.clear();
        }
        return count;
    }
}
