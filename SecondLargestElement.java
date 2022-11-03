public class SecondLargestElement {

    public static void main(String[] args) {
        System.out.println("less Efficient way------");
        int [] array={1,7,2,0,5,8};
        int max = 0;
        for (int i = 0; i < array.length-1; i++) {
            max=Integer.max(array[i],array[i+1]);
        }
        System.out.println(max);
        int secondLargest=Integer.MIN_VALUE;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] > secondLargest && array[i]<max)
                secondLargest=array[i];
        }
        System.out.println(secondLargest);
        System.out.println("More Efficient way------");
        int max1 = 0;
        int secondLargest1=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max1){
                secondLargest1=max1;
                max1=array[i];
            }
        }
        System.out.println(max1);
        System.out.println(secondLargest1);
    }
}
