import java.util.*;

//https://leetcode.com/problems/daily-temperatures/
public class DailyTemperature {
    public static void main(String[] args) {
        int temperatures[]={73,74,75,71,69,72,76,73};
        int tl=temperatures.length;
        int answers[]=new int[tl];
//        Iterative approach 0(N^2)
//        for (int i = 0; i < tl; i++) {
//            int count=0;
//            for (int j = i+1; j < tl; j++) {
//                count++;
//                if (temperatures[j] > temperatures[i]) {
//                    answers[i]=count;
//                    break;
//                }
//            }
//        }
//        for (int i :
//                answers) {
//            System.out.print(i+" ");
//        }

//        linear approach 0(N)
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(0);
        for (int i = 1; i < tl; i++) {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                answers[stack.peek()]=i-stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        for (int i : answers) {
            System.out.print(i+" ");
        }
    }
}
