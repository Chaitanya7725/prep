package arrays;

import java.util.*;

public class DuplicateNumberMedium {

    public static void main(String[] args) {
        int[] nums={1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }

    private static int findDuplicate(int[] nums) {
//        https://www.javatpoint.com/how-to-sort-hashmap-in-java
//        https://stackoverflow.com/questions/26230225/hashmap-getting-first-key-value
//        Map<Integer,Integer> archive=new HashMap<>();
//        for (int array : nums)
//            archive.put(array,archive.getOrDefault(array,0)+1);
//
//        List list = new LinkedList(archive.entrySet());
////        Collections.sort(list, new Comparator()
////        {
////            public int compare(Object o1, Object o2)
////            {
////                return ((Comparable) ((Map.Entry) (o2)).getValue()).compareTo(((Map.Entry) (o1)).getValue());
////            }
////        });
//
//        Collections.sort(list,(o1,o2)-> {
//            return ((Comparable) ((Map.Entry) (o2)).getValue()).compareTo(((Map.Entry) (o1)).getValue());
//        });
//
//        Map sortedHashMap = new LinkedHashMap();
//        for (Iterator it = list.iterator(); it.hasNext();)
//        {
//            Map.Entry entry = (Map.Entry) it.next();
//            sortedHashMap.put(entry.getKey(), entry.getValue());
//        }
//        return Integer.valueOf(sortedHashMap.keySet().toArray()[0].toString());

        Map<Integer,Integer> records=new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            records.put(nums[i],records.getOrDefault(nums[i],0)+1);
        for (Map.Entry<Integer, Integer> entry:records.entrySet())
            if(entry.getValue()>=2)
                return entry.getKey();
        return 0;
    }

}
