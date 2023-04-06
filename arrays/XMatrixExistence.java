package arrays;

public class XMatrixExistence {

    public static void main(String[] args) {
        int[][] grid={{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}};
        System.out.println(checkXMatrix(grid));//true

        int[][] grid1={{5,7,0},{0,3,1},{0,5,0}};
        System.out.println(checkXMatrix(grid1));//false

        int[][] grid2={{5,0,0,1},{0,4,1,5},{0,5,2,0},{4,1,0,2}};
        System.out.println(checkXMatrix(grid2));//false
    }

    private static boolean checkXMatrix(int[][] grid) {
//        int len=grid.length-1;
//        for (int i = 0; i < grid.length; i++){
//            for (int j = 0; j < grid[i].length; j++){
////                System.out.println(i+""+j+" "+grid[i][j]+" "+(i==j && grid[i][j]!=0)+" "+(((i+j)==len) && grid[i][j]!=0));
//                if(i==j || ((i+j)==len)){
//                    if(grid[i][j]==0)
//                        return false;
//                }else if(i!=j && (i+j)!=len ) {
//                    if(grid[i][j]!=0)
//                        return false;
//                }
//            }
//        }
//        return true;

        int len=grid.length-1;
        for (int i = 0; i < grid.length; i++){
            System.out.println(i+" "+grid[i][i]+" "+grid[i][len-i]);
//            if(i==j || ((i+j)==len)){
//                if(grid[i][len-i]==0)
//                    return false;
//            }else if(i!=j && (i+j)!=len ) {
//                if(grid[i][j]!=0)
//                    return false;
//            }
        }
        return true;
    }

}
