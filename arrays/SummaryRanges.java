package arrays;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public static void main(String[] args) {
        int[] nums={0,1,2,4,5,7};
        System.out.println(summaryRanges(nums));//["0->2","4->5","7"]
        int[] nums1={};
        System.out.println(summaryRanges(nums1));//[""]
        int[] nums2={-1,0,1};
        System.out.println(summaryRanges(nums2));//["-1->1"]
    }

    private static List<String> summaryRanges(int[] nums) {
//        Fails in negative numbers ranges
        /*List<String> result=new ArrayList<>();
        if(nums.length==0)
            return result;
        String record=String.valueOf(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if(!String.valueOf(record.charAt(record.length()-1)).equals(String.valueOf(nums[i]-1))){
                result.add(record);
                record="";
                record+=nums[i];
            } else
                record+=String.valueOf(nums[i]);
        }
        result.add(record);
        for (int i = 0; i < result.size(); i++) {
            String str=result.get(i);
            if(str.contains("-") && str.length()==2)
                result.set(i,str);
            else if(str.length()>1){
                str=str.substring(0,1)+"->"+str.substring(str.length()-1);
                result.set(i,str);
            }else
                result.set(i,str);
        }
        return result;*/

        List<String> result=new ArrayList<>();
        int n=nums.length;
        for (int i = 0; i < n; i++) {
            int start=nums[i];
            while(i+1 < n && nums[i+1]==nums[i]+1)
                i++;
            if(start!=nums[i])
                result.add(start+"->"+nums[i]);
            else
                result.add(""+start);

        }
        return result;

    }
}
