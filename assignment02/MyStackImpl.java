package assignment02;

import java.util.ArrayList;

public class MyStackImpl extends ArrayList<Integer> implements MyStack {

    ArrayList<Integer> listIn;

    public MyStackImpl(ArrayList<Integer> listIn) {
        this.listIn = listIn;
    }

    public void push(int e) {
        listIn.add(0,e);
    }

    public Object pop() {
        if(!listIn.isEmpty())
            return listIn.remove(0);
        return 0;
    }

    public Object peek() {
        if(!listIn.isEmpty())
            return listIn.get(0);
        return null;
    }

    public boolean isEmpty() {
        return listIn.isEmpty();
    }
}
