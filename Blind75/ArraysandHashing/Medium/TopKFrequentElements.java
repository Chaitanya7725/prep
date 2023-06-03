package Blind75.ArraysandHashing.Medium;

import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        int k=2;
        System.out.println(Arrays.toString(topKFrequent(nums,k)));//[1,2]

        int[] nums1={1};
        int k1=1;
        System.out.println(Arrays.toString(topKFrequent(nums1,k1)));//[1]

        int[] nums2={3,0,1,0};
        int k2=1;
        System.out.println(Arrays.toString(topKFrequent(nums2,k2)));//[0]

        int[] nums3={1,2};
        int k3=2;
        System.out.println(Arrays.toString(topKFrequent(nums3,k3)));//[1,2]

        int[] nums4={4,1,-1,2,-1,2,3};
        int k4=2;
        System.out.println(Arrays.toString(topKFrequent(nums4,k4)));//[-1,2]

        int[] nums5={1,1,1,2,2,2,3,3,3};
        int k5=3;
        System.out.println(Arrays.toString(topKFrequent(nums5,k5)));//[1,2,3]
    }

    private static int[] topKFrequent(int[] nums, int k) {
        if(nums.length==k) return nums;
        LinkedHashMap<Integer, Integer> capitals = new LinkedHashMap();
        int [] res=new int[k];
        for(int i=0;i<nums.length;i++)
            capitals.put(nums[i],capitals.getOrDefault(nums[i],0)+1);
        Map<Integer, Integer> result = sortMap(capitals);
        Integer[] keyArray = result.keySet().toArray(new Integer[k]);
        int[] intArray = new int[keyArray.length];
        for (int i = 0; i < keyArray.length; i++) {
            intArray[i] = keyArray[i].intValue();
        }
        if(result.size()==k) return intArray;
        int j=0;
        for (int key:result.keySet()) {
            if(k>0){
                res[j]=key;
                j++;
                k--;
            } else
                return res;
        }
        return new int[]{nums[0]};
    }

    public static LinkedHashMap<Integer,Integer> sortMap(HashMap map) {
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(entries);
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : entryList)
            sortedMap.put(entry.getKey(), entry.getValue());
        return sortedMap;
    }

}
