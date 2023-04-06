package arrays;

import java.util.*;

public class SortBy1bit {

    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8};//0,1,2,4,8,3,5,6,7
        sortByBits(arr);
        int[] arr1={1024,512,256,128,64,32,16,8,4,2,1};//[1,2,4,8,16,32,64,128,256,512,1024]
        sortByBits(arr1);
    }

    private static long[] sortByBits(int[] arr) {
        Map<Integer,Long> records= new HashMap<>();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++)
            arr[i]=Integer.valueOf(Integer.toBinaryString(arr[i]));

        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++){
//            long findChar= Integer.toBinaryString(arr[i]).chars().filter(ch -> ch == '1').count();
//            records.put(arr[i],findChar);
//        }
        return sort(records);
    }

    private static long[] sort(Map<Integer, Long> records) {

        LinkedHashMap<String, Long> sortedMap = new LinkedHashMap<>();
        ArrayList<Long> list = new ArrayList<>();

        for (Map.Entry<Integer,Long> entry : records.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list);
        for (Long num : list) {
            for (Map.Entry<Integer,Long> entry : records.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedMap.put(String.valueOf(entry.getKey()),num);
                }
            }
        }

        long [] result=new long[records.size()];
//        for (int i = 0; i < sortedMap.keySet().size(); i++) {
//            result[i]=sortedMap.keySet()[i];
//        }
        return result;
    }

}
