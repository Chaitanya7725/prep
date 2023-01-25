package arrays;

import java.util.Arrays;

public class ImageFlip {

    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int [][]result=flipAndInvertImage(image);
        for (int[] array :result) {
            System.out.println(Arrays.toString(array));
        }
    }

    private static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length/2; j++) {
                int temp=image[i][image.length-1-j];
                image[i][image.length-1-j]=image[i][j];
                image[i][j]=temp;
            }
        }

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if(image[i][j]==0)
                    image[i][j]=1;
                else
                    image[i][j]=0;
            }
        }
        return image;

    }
}
