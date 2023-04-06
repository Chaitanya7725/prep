package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Triangle {

    public static void main(String[] args) {
        List<List<Integer>> triangle=new ArrayList<>() {
            {
                add(Arrays.asList(2));
                add(Arrays.asList(3, 4));
                add(Arrays.asList(6, 5, 7));
                add(Arrays.asList(4, 1, 8, 3));
            }
        };
        System.out.println(minimumTotal(triangle));//11

        List<List<Integer>> triangle1=new ArrayList<>() {
            {
                add(Arrays.asList(-10));
            }
        };
        System.out.println(minimumTotal(triangle1));//-10

        List<List<Integer>> triangle2=new ArrayList<>() {{
                add(Arrays.asList(-1));
                add(Arrays.asList(2,3));
                add(Arrays.asList(1,-1,-3));
            }
        };
        System.out.println(minimumTotal(triangle2));//-1

    }

    private static int minimumTotal(List<List<Integer>> triangle) {
        // Chaitanya: Referred from Neetcode
        List<Integer> records=new ArrayList<>();
        for (int i = 0; i <= triangle.size(); i++)
            records.add(0);
        for (int i = triangle.size()-1; i >=0 ; i--)
            for (int j = 0; j < triangle.get(i).size(); j++)
                records.set(j,(triangle.get(i).get(j)+(Math.min(records.get(j),records.get(j+1)))));
        return records.get(0);
    }

}
