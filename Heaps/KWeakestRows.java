package Heaps;

import java.util.Arrays;

public class KWeakestRows {

    public static void main(String[] args) {
        int[][] mat={{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        int k=3;
        System.out.println(Arrays.toString(kWeakestRows(mat, k)));
    }

    private static int[] kWeakestRows(int[][] mat, int k) {
        int [] result=new int[k];
        int i=0;
        int resCount=0;
        while(i<mat.length){
            long count=Arrays.stream(mat[i]).filter((number) -> number==0 ).count();
            if(count > mat[i].length/2){
                result[resCount]=i;
                resCount++;
            }
            i++;
        }
        return result;
    }

}
