package arrays;

public class NegativenoSortedMatrix {

    public static void main(String[] args) {
        int [] [] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
        int [] [] grid1 = {{3,2},{1,0}};
        System.out.println(countNegatives(grid1));

    }

    private static int countNegatives(int[][] grid) {
        int count=0;
        for (int [] gridElements: grid)
            for (int i = gridElements.length-1; i>=0 ; i--)
                if(gridElements[i]<0)
                    count++;
                else
                    break;
        return count;
    }



}
