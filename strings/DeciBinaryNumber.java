package strings;

public class DeciBinaryNumber {

    public static void main(String[] args) {
        String n="32";
        System.out.println(minPartitions(n));
    }

    private static int minPartitions(String n) {
        int max=0;
        for (char digit : n.toCharArray())
            max=Math.max(max,digit-'0');
        return max;
    }
}
