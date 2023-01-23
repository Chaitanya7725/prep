package strings;

public class BalancedString {
    public static void main(String[] args) {

        String equation = "(()";
        int counter = 0;
        String status="";
        for (int i = 0; i < equation.length(); i++) {
            if (equation.charAt(i) == '(') {
                counter++;
            } else if (equation.charAt(i) == ')') {
                counter--;
            }
            if (counter == 0) {
                status="yes";
            } else {
                status="no";
            }
        }
        System.out.println(status);
    }
}
