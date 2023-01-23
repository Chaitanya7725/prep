package arrays;

//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
public class FinalValue {

    public static void main(String[] args) {
        String[] operations=new String[]{"--X","X++","X++"};
        int res=finalValueAfterOperations(operations);
        System.out.println(res);
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String i:operations){
            if(i.contains("--"))
                x--;
            else if(i.contains("++"))
                x++;
        }
        return x;
    }

}
