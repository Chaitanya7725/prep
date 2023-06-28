import java.util.Arrays;

public class ArrayofArrayProducts {

    public static void main(String[] args) {
        int[] arr={8,10,2};
        System.out.println(Arrays.toString(arrayOfArrayProducts(arr)));

        int[] arr1={2,3,0,982,10};//[0,0,58920,0,0]
        System.out.println(Arrays.toString(arrayOfArrayProducts(arr1)));
//
        int[] arr2={1};
        System.out.println(Arrays.toString(arrayOfArrayProducts(arr2)));
    }
    private static int[] arrayOfArrayProducts(int[] arr) {
        if(arr.length<=1) return new int[]{};

        int [] output=new int[arr.length];
        for (int i = 0; i < output.length; i++)
            output[i]=1;

        int prefix=1;
        int postfix=1;

        for (int i = 0; i < output.length; i++) {
            output[i]=prefix;
            prefix*= arr[i];
        }

        for (int i = output.length-1; i >=0; i--) {
            output[i]*=postfix;
            postfix*=arr[i];
        }

        return output;
    }

}
