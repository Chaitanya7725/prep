package Random;

public class totalStrengthOfWizards {
    public static void main(String[] args) {
        int [] a={1,3,1,2};
        int count=a.length;
        int start=1;
        int iterationCount=1;
        while(start<=count){
            for (int i = 0; i < start; i++) {
                System.out.print(a[i]);
            }
            start++;
            System.out.println();
        }
    }
}
