package arrays.easy;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReshapetheMatrix {

    public static void main(String[] args) {
        int[][] mat={{1,2},{3,4}};
        int r=1;
        int c=4;
        for (int[] array:matrixReshape(mat,r,c))
            System.out.println(Arrays.toString(array));

        int[][] mat1={{1,2},{3,4}};
        int r1=2;
        int c1=4;
        for (int[] array:matrixReshape(mat1,r1,c1))
            System.out.println(Arrays.toString(array));

        int[][] mat2={{1,2},{3,4}};
        int r2=4;
        int c2=1;
        for (int[] array:matrixReshape(mat2,r2,c2))
            System.out.println(Arrays.toString(array));

        int[][] mat3={{1,2}};
        int r3=1;
        int c3=1;
        for (int[] array:matrixReshape(mat3,r3,c3))
            System.out.println(Arrays.toString(array));
    }

    private static int[][] matrixReshape(int[][] mat, int r, int c) {
        int [] array = Stream.of(mat).flatMapToInt(IntStream::of).toArray();
        int[][] res=new int[r][c];
        int count=0;
        if((r*c) != array.length)
            return mat;
        else
            if(r==1 && r > c) {
                for (int i = 0; i < r; i++)
                    for (int j = 0; j < c; j++){
                        System.out.println(j+""+i);
                        res[j][i]=array[count];
                        count++;
                    }
            }else{
                for (int i = 0; i < r; i++)
                    for (int j = 0; j < c; j++){
                        res[i][j]=array[count];
                        count++;
                    }
            }

        return res;
    }
}
