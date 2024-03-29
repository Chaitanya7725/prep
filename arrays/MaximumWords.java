package arrays;

//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/
public class MaximumWords {

    public static void main(String[] args) {
//        String[] sentences=new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        String[] sentences=new String[]{"w jrpihe zsyqn l dxchifbxlasaehj","nmmfrwyl jscqyxk a xfibiooix xolyqfdspkliyejsnksfewbjom","xnleojowaxwpyogyrayfgyuzhgtdzrsyococuqexggigtberizdzlyrdsfvryiynhg","krpwiazoulcixkkeyogizvicdkbrsiiuhizhkxdpssynfzuigvcbovm","rgmz rgztiup wqnvbucfqcyjivvoeedyxvjsmtqwpqpxmzdupfyfeewxegrlbjtsjkusyektigr","o lgsbechr lqcgfiat pkqdutzrq iveyv iqzgvyddyoqqmqerbmkxlbtmdtkinlk","hrvh efqvjilibdqxjlpmanmogiossjyxepotezo","qstd zui nbbohtuk","qsdrerdzjvhxjqchvuewevyzlkyydpeeblpc"};
        int maximum=mostWordsFound(sentences);
        System.out.println(maximum);
    }

    public static int mostWordsFound(String[] sentences) {
//        Approach 1
        /*int maximum=0;
        for(String sentence:sentences){
            int count=0;
            String [] words=sentence.split(" ");
            for (String word: words) {
                count++;
                if(count>maximum)
                    maximum=count;
            }
        }
        return maximum;*/

//        Approach 2
        int maximum=0;
        for(String sentence:sentences){
//            System.out.println(sentence.split(" ").length);
//            maximum=0;
            int length=sentence.split(" ").length;
//            System.out.println(length+" "+maximum+" "+(length>maximum));
            if(length>maximum) {
                maximum=length;
            }
        }
        return maximum;
    }
}
