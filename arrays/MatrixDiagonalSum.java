package arrays;

public class MatrixDiagonalSum {

    public static void main(String[] args) {
//        Chaitanya: Used a little matrix match and two for loop
//        https://leetcode.com/problems/matrix-diagonal-sum/
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        int count=diagonalSum(mat);
        System.out.println(count);
        int[][] mat1={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        count=diagonalSum(mat1);
        System.out.println(count);
    }

    private static int diagonalSum(int[][] mat) {
        int count=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if(i==j || mat.length-1==(i+j))
                    count+=mat[i][j];
            }
        }
        return count;
    }

}
