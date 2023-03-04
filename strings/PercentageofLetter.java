package strings;

public class PercentageofLetter {

    public static void main(String[] args) {
        String s="foobar";
        char letter='o';
        System.out.println(percentageLetter( s, letter));
    }

    private static int percentageLetter(String s, char letter) {
        int count=0;
        for (char alpha : s.toCharArray()) {
            if(alpha==letter)
                count++;
        }
        return count > 0 ? (count*100/s.length()):0;
    }

}
