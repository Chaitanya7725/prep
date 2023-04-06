package Random;

public class maxNumOfWordsInSentences {

    public int mostWordsFound(String[] sentences) {
        int length = sentences.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            int arrOfStr = 0;
            int sentLength = sentences[i].length();
            for (int j = 0; j < sentLength; j++) {
                if (sentences[i].charAt(j) == ' ') {
                    arrOfStr++;
                }
            }
            if (arrOfStr >= count) {
                count = arrOfStr;
            }
            // arrOfStr = sentences[i].split(" ").length;
            // if (count < arrOfStr) {
            // count = arrOfStr;
            // }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        maxNumOfWordsInSentences m = new maxNumOfWordsInSentences();
        String[] sentences = { "w jrpihe zsyqn l dxchifbxlasaehj",
                "nmmfrwyl jscqyxk a xfibiooix xolyqfdspkliyejsnksfewbjom",
                "xnleojowaxwpyogyrayfgyuzhgtdzrsyococuqexggigtberizdzlyrdsfvryiynhg",
                "krpwiazoulcixkkeyogizvicdkbrsiiuhizhkxdpssynfzuigvcbovm",
                "rgmz rgztiup wqnvbucfqcyjivvoeedyxvjsmtqwpqpxmzdupfyfeewxegrlbjtsjkusyektigr",
                "o lgsbechr lqcgfiat pkqdutzrq iveyv iqzgvyddyoqqmqerbmkxlbtmdtkinlk",
                "hrvh efqvjilibdqxjlpmanmogiossjyxepotezo", "qstd zui nbbohtuk",
                "qsdrerdzjvhxjqchvuewevyzlkyydpeeblpc" };
        m.mostWordsFound(sentences);
    }

}
