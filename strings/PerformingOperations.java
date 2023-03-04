package strings;

public class PerformingOperations {

    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};//1
        System.out.println(finalValueAfterOperations(operations));
        String[] operations1 = {"++X","++X","X++"};//3
        System.out.println(finalValueAfterOperations(operations1));
    }

    private static int finalValueAfterOperations(String[] operations) {
        int count=0;
        for(String i:operations){
            if(i.charAt(1)=='-')
                count--;
            else
                count++;
        }
        return count;
    }

}
