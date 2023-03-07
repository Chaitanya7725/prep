package arrays.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MissingRanges {

    public static void main(String[] args) {
        int[] nums={0,1,3,50,75};
        int lower=0;
        int upper=99;
        System.out.println(findMissingRanges(nums, lower, upper));//"2","4->49","51->74","76->99"

        int[] nums1={-1};
        int lower1=-1;
        int upper1=-1;
        System.out.println(findMissingRanges(nums1, lower1, upper1));//"-1"

        int[] nums2={};
        int lower2=1;
        int upper2=1;
        System.out.println(findMissingRanges(nums2, lower2, upper2));//"1"

        int[] nums3={};
        int lower3=-3;
        int upper3=-1;
        System.out.println(findMissingRanges(nums3, lower3, upper3));//"-3->-1"
    }

    private static List<String> findMissingRanges(int[] nums, int lower, int upper) {
//        if(nums.length==0 && lower!=upper) return new ArrayList<>();
        if(nums.length==0 && upper==lower) return new ArrayList<>(){{add(lower+"");}};
        if(nums.length==0 && upper!=lower) return new ArrayList<>(){{add(lower+"");}};
        List<String> result=new ArrayList<>();
        if(Math.abs(lower-nums[0])==2)
            result.add(lower+1+"");
        if(Math.abs(lower-nums[0])>2)
            result.add((lower+1)+"->"+(nums[0]-1));
        for (int i = 1; i < nums.length; i++) {
            int diff=Math.abs(nums[i]-nums[i-1]);
            if(diff>2)
                result.add((nums[i-1]+1)+"->"+(nums[i]-1));
            if(diff==2)
                result.add(nums[i-1]+1+"");
        }
        if(Math.abs(upper-nums[nums.length-1])==2)
            result.add(upper-1+"");
        if(Math.abs(upper-nums[nums.length-1])>2)
            result.add((nums[nums.length-1]+1)+"->"+(upper));
        return result;
    }

}
