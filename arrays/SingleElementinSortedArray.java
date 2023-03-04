package arrays;

public class SingleElementinSortedArray {

    public static void main(String[] args) {
        int[] nums = { 1 };
//        int[] nums = { 1,1,2,2,3,4,4 };
        int min = 0;
        int max = nums.length - 1;
        if(max==1)
            System.out.println(nums[0]);
        else if (nums[0]!=nums[1]) {
            System.out.println(nums[0]);
        } else if (nums[max]!=nums[max-1]) {
            System.out.println(nums[max]);
        }else{
            int index = singleNonDuplicate(nums, min,max);
            System.out.println(index);
        }
    }

    public static int singleNonDuplicate(int[] nums, int l, int r) {
        if(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1])
                return nums[mid];
            if(((mid%2)==0 && nums[mid]==nums[mid+1]) || ((mid%2)==1 && nums[mid]==nums[mid-1]))
                return singleNonDuplicate(nums,mid+1,r);
            else
                return singleNonDuplicate(nums,l,mid-1);
        }
        return -1;
    }

}
