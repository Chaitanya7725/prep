public class balancedString {
    public static void main(String[] args) {

        String equation = "()";
        int counter = 0;
        for (int i = 0; i < equation.length(); i++) {
            if (equation.charAt(i) == '(') {
                counter++;
            } else if (equation.charAt(i) == ')') {
                counter--;
            }
            if (counter == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
