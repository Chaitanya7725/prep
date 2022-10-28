import java.util.*;

public class ValidParenthesis {
    public static void main(String[] args) {
        String input="]";
//        String input="(])";
        int length=input.length();

        List<Character> open_syntax=new ArrayList<>();
        open_syntax.add('(');
        open_syntax.add('{');
        open_syntax.add('[');

        Stack<Character> stack = new Stack<Character>();

        Map<Character,Character> close_syntax_check=new HashMap<>();
        close_syntax_check.put(')','(');
        close_syntax_check.put(']','[');
        close_syntax_check.put('}','{');

        for (int i = 0; i < length; i++) {
            Character c=input.charAt(i);
            if(open_syntax.contains(c)){
                stack.push(input.charAt(i));
            }else{
                if(!stack.isEmpty() && stack.peek()==close_syntax_check.get(c)){
                    stack.pop();
                }else{
                    System.out.println("false");
                    return;
                }
            }
        }
        if(stack.isEmpty())
            System.out.println("true");
        else
            System.out.println("false");
    }
}
