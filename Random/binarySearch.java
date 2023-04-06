package Random;

public class binarySearch {

    public static void main(String[] args) {
        int[] nums = { -1, 0, 9,10,11, 12 };
        int min = 0;
        int max = nums.length - 1;
        int index = search(nums, min,max,13);
        System.out.println(index);
    }

    public static int search(int[] nums, int l, int r, int target) {
        if(l<=r){
            int mid=(l+(r))/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]<target)
                return search(nums,mid+1,r,target);
            return search(nums,l,mid-1,target);
        }
        return -1;
    }

}
