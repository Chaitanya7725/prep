package strings;

public class goalParser {

    public static String interpret(String command) {
        String result = "";
        String temp = "";
        int len = command.length();
        for (int i = 0; i < len; i++) {
            temp += command.charAt(i);
            if (temp.equals("G")) {
                result += "G";
                temp = "";
            } else if (temp.equals("()")) {
                result += "o";
                temp = "";
            } else if (temp.equals("(al)")) {
                result += "al";
                temp = "";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // String input = "G()(al)";
        String input = "G()()()()(al)";
        String result = interpret(input);
        System.out.println(result);
    }
}
