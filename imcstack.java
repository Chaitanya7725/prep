import java.util.Stack;

public class imcstack {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        int temp;
        s1.push(4);
        s1.push(5);
        System.out.println(s1);
        while (!s1.empty()) {
            s2.push(s1.peek());
            s1.pop();
        }
        while (!s2.empty()) {
            temp = (int) s2.peek() + 1;
            s1.push(temp);
            s2.pop();
        }
        System.out.println(s1);
    }
}
