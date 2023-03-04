package arrays;

public class DeleteColumnsforSorting {

    public static void main(String[] args) {
        String[] strs={"cba","daf","ghi"};
        System.out.println(minDeletionSize(strs));
    }

    private static int minDeletionSize(String[] strs) {
        int count=0;
        for (String word : strs) {
            if(getStatus(word)){
                count++;
            }
        }
        return count;
    }

    private static boolean getStatus(String word){
        boolean status=false;
        for (int i = 0; i < word.length()-1; i++) {
            if(word.charAt(i)>=word.charAt(i+1))
                status=true;
            break;
        }
        return status;
    }
}
