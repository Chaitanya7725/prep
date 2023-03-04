package arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle1 {

    public static void main(String[] args) {
        int number=5;
        System.out.println(getTriangle(number));
        int number1=1;
        System.out.println(getTriangle(number1));
        int number2=3;
        System.out.println(getTriangle(number2));
    }
    private static List<List<Integer>> getTriangle(int number){
        List<List<Integer>> triangle=new ArrayList<>();

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int row = 1; row < number; row++) {
            List<Integer> currRow=new ArrayList<>();
            List<Integer> prevRow=triangle.get(row-1);
            currRow.add(1);
            for (int i = 1; i < prevRow.size(); i++) {
                currRow.add(prevRow.get(i-1)+prevRow.get(i));
            }
            currRow.add(1);
            triangle.add(currRow);
        }
        return triangle;
    }
}

