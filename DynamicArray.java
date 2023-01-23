import java.util.Arrays;
import java.util.List;

public class DynamicArray {
    public static void main(String[] args) {
        int [] array= new int[]{0, 0};
        int[] newArr = new int[0];
        for (int i = 0; i < 2; i++) {
            if((i+1)==array.length){
                System.out.print(" same length ");
                newArr=Arrays.copyOf(array, array.length*2);
            }
            System.out.print(array[i]+" ");
        }
        System.out.println(newArr.length);
    }
}
