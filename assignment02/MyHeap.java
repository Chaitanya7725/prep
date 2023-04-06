package assignment02;

import java.util.ArrayList;

public class MyHeap {

    ArrayList<Integer> list;

    public MyHeap(ArrayList<Integer> listIn) {
        if(listIn==null || !listIn.isEmpty())
            throw new IllegalArgumentException("Must  provide ab empty Arraylist");
        else
            this.list = listIn;
    }




}
