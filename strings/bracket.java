package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class bracket {
    public static void main(String[] args) {
        String s = "([)]";
        // String s = "[()]{}{[()()]()}";
        boolean result = bracket.isValid(s);
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
        List<String> check = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            // if (check.contains(s.charAt(i))) {
            // check.remove(s.charAt(i));
            System.out.println(s.charAt(i) + " " + map.get(s.charAt(i)));
            // }
        }
        // if ((s.length() % 2) == 0) {
        // Stack<Character> opening = new Stack<Character>();
        // Stack<Character> closing = new Stack<Character>();
        // for (int i = 0; i < s.length(); i++) {
        // Character c = s.charAt(i);
        // if (c == '{' || c == '(' || c == '[') {
        // opening.push(c);
        // } else if (c == '}' || c == ')' || c == ']') {
        // closing.push(c);
        // }
        // }
        // for (int i = 0; i < opening.size(); i++) {
        // Character a = map.get(opening.get(i));
        // Character b = closing.get(i);
        // if (!a.equals(b)) {
        // status = false;
        // } else {
        // status = true;
        // }
        // }
        // } else {
        // return status;
        // }
        return status;
    }

}
