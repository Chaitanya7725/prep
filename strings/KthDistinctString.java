package strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class KthDistinctString {

//    https://www.geeksforgeeks.org/linkedhashmap-class-in-java/
    public static void main(String[] args) {
        String[] arr={"d","b","c","b","c","a"};
        int k=2;
        System.out.println(kthDistinct(arr, k));//a

        String[] arr1={"aaa","aa","a"};
        int k1=1;
        System.out.println(kthDistinct(arr1, k1));//aaa

        String[] arr2={"a","b","a"};
        int k2=3;
        System.out.println(kthDistinct(arr2, k2));//""
    }

    private static String kthDistinct(String[] arr, int k) {
        Map<String,Integer> records=new LinkedHashMap<>();
        int count=1;
        for (int i = 0; i < arr.length; i++)
            records.put(arr[i],records.getOrDefault(arr[i],0)+1);
        for (Map.Entry<String, Integer> entry:records.entrySet())
            if(entry.getValue()==1){
                if(count==k)
                    return entry.getKey();
                count++;
        }
        return "";
    }
}
