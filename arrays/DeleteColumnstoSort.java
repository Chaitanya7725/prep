package arrays;

public class DeleteColumnstoSort {

    public static void main(String[] args) {
        String[] strs={"cba","daf","ghi"};//1
        System.out.println(minDeletionSize(strs));
        String[] strs1={"a","b"};//0
        System.out.println(minDeletionSize(strs1));
        String[] strs2={"zyx","wvu","tsr"};//3
        System.out.println(minDeletionSize(strs2));
        String[] strs3={"abc","def","ghi"};//0
        System.out.println(minDeletionSize(strs3));
        String[] strs4={"rrjk","furt","guzm"};//2
        System.out.println(minDeletionSize(strs4));
    }

    private static int minDeletionSize(String[] strs) {
//        https://leetcode.com/problems/delete-columns-to-make-sorted/
        int deleted=0;
        int columns=strs[0].length();
        int rows=strs.length;
        for (int i = 0; i < columns; i++)
            for (int j = 1; j < rows; j++)
                if (strs[j - 1].charAt(i) > strs[j].charAt(i)) {
                    deleted++;
                    break;
                }
        return deleted;
    }
}
