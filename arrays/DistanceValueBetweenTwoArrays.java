package arrays;

public class DistanceValueBetweenTwoArrays {

    public static void main(String[] args) {
        int[] arr1={4,5,8};
        int[] arr2={10,9,1,8};
        int d=2;
        System.out.println(findTheDistanceValue(arr1,arr2,d));//2

        int[] arr3={1,4,2,3};
        int[] arr4={-4,-3,6,10,20,30};
        int d1=3;
        System.out.println(findTheDistanceValue(arr3,arr4,d1));//2

        int[] arr5={2,1,100,3};
        int[] arr6={-5,-2,10,-3,7};
        int d2=6;
        System.out.println(findTheDistanceValue(arr5,arr6,d2));//1
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int result=0;
        for (int i = 0; i < arr1.length; i++) {
            int check=0;
            for (int j = 0; j < arr2.length; j++)
                if(Math.abs(arr1[i]-arr2[j])>d)
                    check++;
            if(check == arr2.length)
                result++;
        }
        return result;
    }
}
