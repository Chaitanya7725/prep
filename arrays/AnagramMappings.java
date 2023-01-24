package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramMappings {

    public static void main(String[] args) {
        int[] nums1= {12,28,46,32,50};
        int[] nums2= {50,12,32,46,28};
        anagramMappings(nums1,nums2);
//        System.out.println();
    }

    private static int[] anagramMappings(int[] nums1, int[] nums2) {
        int[] answer=new int[nums1.length];
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums2.length; i++)
            map.put(nums2[i],i);
        for (int i = 0; i < nums2.length; i++)
            answer[i]=map.get(nums1[i]);
        return answer;
    }

}
