package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PointsInsideCircle {

    public static void main(String[] args) {
        int[][] points={{1,3},{3,3},{5,3},{2,2}};
        int[][] queries={{2,3,1},{4,3,1},{1,1,2}};
        System.out.println(Arrays.toString(countPoints(points,queries)));

        int[][] points1={{1,1},{2,2},{3,3},{4,4},{5,5}};
        int[][] queries1={{1,2,2},{2,2,2},{4,3,2},{4,3,3}};
        System.out.println(Arrays.toString(countPoints(points1,queries1)));
    }

    private static int[] countPoints(int[][] points, int[][] queries) {
        List<Integer> result=new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            int count=0;
            for (int j = 0; j < points.length; j++)
                if(Math.sqrt(Math.pow(queries[i][0]-points[j][0],2)+Math.pow(queries[i][1]-points[j][1],2))<=queries[i][2])
                    count++;
            result.add(count);
        }
        int [] res=new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i]= result.get(i);
        }
        return res;
    }
}
