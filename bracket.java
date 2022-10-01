import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class bracket {
    public static void main(String[] args) {
        boolean result = bracket.isValid("([)]");
        System.out.println(result);
    }

    public static boolean isValid(String s) {
        boolean status = false;
        Map<Character, Character> map = new HashMap<Character, Character>() {
            {
                put('{', '}');
                put('(', ')');
                put('[', ']');
            }
        };
        if ((s.length() % 2) == 0) {
            Stack<Character> opening = new Stack<Character>();
            Stack<Character> closing = new Stack<Character>();
            for (int i = 0; i < s.length(); i++) {
                Character c = s.charAt(i);
                if (c == '{' || c == '(' || c == '[') {
                    opening.push(c);
                } else if (c == '}' || c == ')' || c == ']') {
                    closing.push(c);
                }
            }
            for (int i = 0; i < opening.size(); i++) {
                Character a = map.get(opening.get(i));
                Character b = closing.get(i);
                if (!a.equals(b)) {
                    status = false;
                } else {
                    status = true;
                }
            }
        } else {
            return status;
        }
        return status;
    }

}
