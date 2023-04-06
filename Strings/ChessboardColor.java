package strings;

public class ChessboardColor {

    static String alpha="abcdefgh";
    public static void main(String[] args) {
        String coordinates="a1";
        System.out.println(squareIsWhite(coordinates));//false black

        String coordinates1="h3";
        System.out.println(squareIsWhite(coordinates1));//true white

        String coordinates2="c7";
        System.out.println(squareIsWhite(coordinates2));//false black
    }

    private static boolean squareIsWhite(String coordinates) {
        if((alpha.indexOf(coordinates.charAt(0))+Integer.parseInt(String.valueOf(coordinates.charAt(1))))%2==0)
            return true;
        return false;
    }

}
