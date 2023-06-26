import java.util.Arrays;

public class ArrayofArrayProducts {

    public static void main(String[] args) {
        int[] arr={8,10,2};
        System.out.println(Arrays.toString(arrayOfArrayProducts(arr)));

        int[] arr1={2,3,0,982,10};//[0,0,58920,0,0]
        System.out.println(Arrays.toString(arrayOfArrayProducts(arr1)));

        int[] arr2={1};
        System.out.println(Arrays.toString(arrayOfArrayProducts(arr2)));
    }

    private static int[] arrayOfArrayProducts(int[] arr) {
        if(arr.length==1) return new int[]{};
        int total=1;
        int [] output=new int[arr.length];
        int zeroCount=0;

        for(int i=0;i<arr.length;i++)
            if(arr[i]!=0)
                total*=arr[i];
            else
                zeroCount++;

        for(int i=0;i<arr.length;i++)
            if(arr[i]==0)
                output[i]=total;
            else if(arr[i]!=0 && zeroCount==1)
                output[i]=0;
            else
                output[i]=total/arr[i];

        return output;
    }

}
