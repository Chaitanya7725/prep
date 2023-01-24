package arrays;

public class TruncateSentence {

//    https://leetcode.com/problems/truncate-sentence/description/
    public static void main(String[] args) {
        String s="Hello how are you Contestant";
        int k=4;
        String reduced=truncateSentence(s,k);
        System.out.println(reduced);
    }
    private static String truncateSentence(String s,int k) {
        String res="";
        String [] sentences=s.split(" ");
        for (int i = 0; i < k; i++) {
            if(i<k-1)
                res+=sentences[i]+" ";
            else
                res+=sentences[i];
        }
        return res;
    }

}
