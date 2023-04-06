package assignment02;

import java.util.ArrayList;

public class MyStackTest {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        MyStackImpl stackList=new MyStackImpl(list);
        stackList.push(1);
        stackList.push(2);
        stackList.push(3);
        System.out.println(stackList.pop());
        System.out.println(stackList.peek());
        System.out.println(stackList.isEmpty());
        System.out.println(stackList.pop());
        System.out.println(stackList.pop());
        System.out.println(stackList.peek());
        System.out.println(stackList.isEmpty());

    }

}
