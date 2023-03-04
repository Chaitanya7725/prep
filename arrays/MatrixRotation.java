package arrays;

import java.util.Arrays;

public class MatrixRotation {

    public static void main(String[] args) {
        int[][] matrix={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
    }

    private static void rotate(int[][] matrix) {
        for (int [] array: matrix)
            System.out.println(Arrays.toString(array));
        int l=0;
        int r=matrix.length-1;

        while(l<r){
            int top=l;
            int bottom=r;
            for (int i = 0; i < r-l; i++) {
                int temp=matrix[top][l+i];
                matrix[top][l+i]=matrix[bottom-i][l];
                matrix[bottom-i][l]=matrix[bottom][r-i];
                matrix[bottom][r-i]=matrix[top+i][r];
                matrix[top+i][r]=temp;
            }
            l+=1;
            r-=1;
        }
        System.out.println();
        for (int [] array: matrix)
            System.out.println(Arrays.toString(array));
    }

}
