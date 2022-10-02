public class findDigits {

    public static int findDigits(int n) {
        String s = String.valueOf(n);
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = Character.getNumericValue(s.charAt(i));
            if (num != 0 && (n % num == 0)) {
                flag++;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        // int n = findDigits(2);
        int n = findDigits(12);
        // int n = findDigits(1012);
        System.out.println(n);
    }

}
