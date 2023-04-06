package arrays.easy;

public class ExcelSheetColumnTitle {

    static String alpha="ABCDEFGHIJKLMNOPQRSSTUVWXYZ";
    public static void main(String[] args) {
        int columnNumber = 28;
        System.out.println(convertToTitle(columnNumber));//AB

        int columnNumber1 = 1;
        System.out.println(convertToTitle(columnNumber1));//A

        int columnNumber2 = 27;
        System.out.println(convertToTitle(columnNumber2));//AA

        int columnNumber3 = 701;
        System.out.println(convertToTitle(columnNumber3));//ZY

        int columnNumber4 = 10;
        System.out.println(convertToTitle(columnNumber4));//J

        int columnNumber5 = 11;
        System.out.println(convertToTitle(columnNumber5));//K
    }
    private static String convertToTitle(int columnNumber) {
        String res="";
        while (columnNumber>26){
            int div=columnNumber/26;
            res+=alpha.charAt(div);
            columnNumber%=26;
        }
        res+=alpha.charAt(columnNumber);
        return res;
    }
}
