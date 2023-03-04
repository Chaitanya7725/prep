package arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {

    public static void main(String[] args) {
        int rowIndex=3;
        System.out.println(getRow(rowIndex));//[1,3,3,1]

        int rowIndex1=0;
        System.out.println(getRow(rowIndex1));//[1]

        int rowIndex2=1;
        System.out.println(getRow(rowIndex2));//[1,1]
    }

    private static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle=new ArrayList<>();

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> currRow=new ArrayList<>();
            List<Integer> prevRow=triangle.get(i-1);
            currRow.add(1);
            for (int j = 1; j < prevRow.size(); j++)
                currRow.add(prevRow.get(j-1)+prevRow.get(j));
            currRow.add(1);
            triangle.add(currRow);
        }
        return triangle.get(triangle.size()-1);
    }

}
