package arrays;

import java.util.Arrays;

public class Convolution {

    public static void main(String[] args) {
        int [][]grid = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        int [][]answer=largestLocal(grid);
        for (int[] index :answer) {
            System.out.println(Arrays.toString(index));
        }
    }

    public static int[][] largestLocal(int[][] grid) {
        int[][] answer=new int[grid.length-2][grid.length-2];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++)
                answer[i][j]=getMax(grid,i,j);
        }
        return answer;
    }

    private static int getMax(int [] [] grid,int i,int j){
        int max=0;
        for (int k = i; k < i+2; k++) {
            for (int l = j; l < j+2; l++)
                max=Math.max(grid[k][l],max);
        }
        return max;
    }
}
