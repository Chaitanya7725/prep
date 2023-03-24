package arrays.easy;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RangeAddition {

    public static void main(String[] args) {
        int m=3;
        int n=3;
        int[][] ops={{2,2},{3,3}};
        System.out.println(maxCount(m, n, ops));//4

        int m1=3;
        int n1=3;
        int[][] ops1={{2,2},{3,3},{3,3},{3,3},{2,2},{3,3},{3,3},{3,3},{2,2},{3,3},{3,3},{3,3}};
        System.out.println(maxCount(m1, n1, ops1));//4

        int m2=3;
        int n2=3;
        int[][] ops2={};
        System.out.println(maxCount(m2, n2, ops2));//9

        int m3=40000;
        int n3=40000;
        int[][] ops3={};
        System.out.println(maxCount(m3, n3, ops3));
    }

    private static int maxCount(int m, int n, int[][] ops) {
        int max=Integer.MIN_VALUE;
        int count=0;
        int [][] array =new int[m][n];
        for (int i = 0; i < ops.length; i++) {
            int row=ops[i][0];
            int col=ops[i][1];
            for (int rowEle = 0; rowEle < row; rowEle++)
                for (int colEle = 0; colEle < col; colEle++)
                    array[rowEle][colEle]=array[rowEle][colEle]+1;
        }
        int [] array1 = Stream.of(array).flatMapToInt(IntStream::of).toArray();
        for (int a:array1)
            if(a>max){
                max=a;
                count=1;
            } else if (a==max)
                count++;
        return count;
    }

}
