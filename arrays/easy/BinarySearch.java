package arrays.easy;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        int target=9;
        System.out.println(search(nums, target));

        int[] nums1={-1,0,3,5,8,12};
        int target1=9;
        System.out.println(search(nums1, target1));
    }

    private static int search(int[] nums, int target) {
        int min=0;
        int max= nums.length-1;
        while(min<=max){
            int mid=(min+max)/2;
            if(target == nums[mid])
                return mid;
            else if (target < nums[mid])
                max=mid-1;
            else
                min=mid+1;
        }
        return -1;
    }

}
