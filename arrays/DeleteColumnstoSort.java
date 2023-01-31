package arrays;

import java.util.Arrays;

public class DeleteColumnstoSort {

    public static void main(String[] args) {
//        String[] strs={"cba","daf","ghi"};//1
//        System.out.println(minDeletionSize(strs));
//        String[] strs1={"a","b"};//0
//        System.out.println(minDeletionSize(strs1));
//        String[] strs2={"zyx","wvu","tsr"};//3
//        System.out.println(minDeletionSize(strs2));
//        String[] strs3={"abc","dei","ghf"};//0
//        System.out.println(minDeletionSize(strs3));
        String[] strs4={"rrjk","furt","guzm"};//2
        System.out.println(minDeletionSize(strs4));
    }

    private static int minDeletionSize(String[] strs) {
        int deleted=0;
        int length=strs.length;
        int length1=strs[0].length();
        if(strs[0].length()<2)
            length=length-1;
        for (int i = 0; i < length; i++)
            if(strs[0].length()<2){
                System.out.println(strs[i].charAt(0)+" "+strs[i+1].charAt(0)+" "+(strs[i].charAt(0)>strs[i+1].charAt(0)));
//                if(strs[i].charAt(0)>strs[i+1].charAt(0))
//                    deleted++;
            }else
                for (int j = 0; j < length1; j++){
                    System.out.println(i+" "+strs[i].charAt(j)+" "+strs[i+1].charAt(j));
//                    System.out.println(i+" "+strs[j].charAt(i)+" "+strs[j+1].charAt(i)+" "+(strs[j].charAt(i)>strs[j+1].charAt(i)));
//                    if(strs[j].charAt(i)>strs[j+1].charAt(i)){
//                        deleted++;
//                        break;
//                    }
                }
        return deleted;
    }
}
