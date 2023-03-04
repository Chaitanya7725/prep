package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

public class RelativeRanks {

    public static void main(String[] args) {
        int[] score={10,3,8,9,4};
        System.out.println(Arrays.toString(findRelativeRanks(score)));//"Gold Medal","5","Bronze Medal","Silver Medal","4"
    }

    private static String[] findRelativeRanks(int[] score) {
        String [] results=new String[score.length];
        SortedMap<Integer,Integer> records=new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < score.length; i++)
            records.put(score[i],i);

        int count=0;
        for (Integer array: records.values()) {
            if(count==0)
                results[array]="Gold Medal";
            else if(count==1)
                results[array]="Silver Medal";
            else if(count==2)
                results[array]="Bronze Medal";
            else if(count>2)
                results[array]=String.valueOf(count+1);
            count++;
        }
        return results;
    }

}
