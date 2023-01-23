package arrays;

//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/
public class MaximumWords {

    public static void main(String[] args) {
        String[] sentences=new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int maximum=mostWordsFound(sentences);
        System.out.println(maximum);
    }

    public static int mostWordsFound(String[] sentences) {
        int maximum=0;
        for(String sentence:sentences){
            int count=0;
            String [] words=sentence.split(" ");
            for (String word: words) {
                count++;
                if(count>maximum)
                    maximum=count;
            }
        }
        return maximum;
    }
}
