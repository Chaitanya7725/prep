package arrays;

import java.util.Stack;

public class BaseballGame {

    public static void main(String[] args) {
        String[] operations={"5","2","C","D","+"};//30
        System.out.println(calPoints(operations));
        String[] operations1={"5","-2","4","C","D","9","+","+"};//27
        System.out.println(calPoints(operations1));
        String[] operations2={"1","C"};//0
        System.out.println(calPoints(operations2));
    }

    private static int calPoints(String[] operations) {
//        https://leetcode.com/problems/baseball-game/
        int sum=0;
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            int peeked=0;
            if(operations[i]=="C"){
                stack.pop();
            } else if (operations[i]=="D"){
                peeked=stack.peek();
                stack.push(2*peeked);
            } else if (operations[i]=="+"){
                peeked=stack.peek();
                stack.pop();
                int second=stack.peek();
                stack.push(peeked);
                stack.push(peeked+second);
            } else {
                int j=Integer.valueOf(operations[i]);
                stack.push(j);
            }
        }
        while(!stack.isEmpty())
            sum+=stack.pop();
        return sum;
    }
}
