package Random;

public class CountOccurence {

    //count of occurrence of particular element
    public static void main(String[] args) {
        int a[]={3,5,5,5,5,7,8,8};
        int numberTobeSearched=5;
        int start=binarySearching(a, numberTobeSearched,true);
        int end=binarySearching(a, numberTobeSearched,false);
        System.out.println(end-start+1);
    }

    private static int binarySearching(int[] a, int numberTobeSearched, boolean searchFirst) {

        int min=0;
        int max=a.length-1;
        int result=-1;

        while (min<=max){
            int mid=(min+max)/2;
            if(a[mid]==numberTobeSearched){
                result=mid;
                if(searchFirst)
                    max=mid-1;
                else
                    min=mid+1;
            }else if(numberTobeSearched<=a[mid])
                max=mid-1;
            else
                min=mid+1;
        }
        return result;
    }

}
