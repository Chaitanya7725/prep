package LL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LLC {

    private Node head;
    private Node tail;
    private int size;
    List<Integer> indexes=new ArrayList<>();
    public class Node{

        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int value) {
        Node node=new Node(value);
        node.next=head;
        head=node;
        if (tail==null){
            tail=head;
        }
        size++;
    }

    public void insertLast(int value) {
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insert(int value, int index) {
        if(index==0){
            insertFirst(value);
            return;
        }else if (index==size){
            insertLast(value);
            return;
        }
        Node temp=head;
        Node prev = null;
        for (int i = 1; i < index; i++) {
            prev=temp.next;
        }
        Node node=new Node(value,prev.next);
        prev.next=node;
        size++;
    }

    public int deleteFirst() {
        Node node=head;
        head=head.next;
        size--;
        return node.value;
    }

    public int deleteLast() {
        Node secondLast=getSecondLast(size-2);
        tail.next=secondLast;
        int deleted=secondLast.next.value;
        secondLast.next=null;
        size--;
        return deleted;
    }

    public int deleteByIndex(int index) {
        Node prev=getPrevious(index-1);
        int returnedValue=prev.next.value;
        prev.next=prev.next.next;
        size--;
        return returnedValue;
    }

    private Node getPrevious(int index) {
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }
    private Node getSecondLast(int i) {
        Node node=head;
        for (int j = 0; j < i; j++) {
            node=node.next;
        }
        return node;
    }

    public void findIndexByValue(int value) {
        Node node=head;
        int counter=0;
        for (int i = 0; i < size; i++) {
            if(node.value==value) {
                System.out.print(i + " ");
                indexes.add(i-counter);
                counter++;
            }
            node=node.next;
        }
        System.out.println();
    }

    public void deleteByValue(int value){
        findIndexByValue(value);
        for (int i = 0; i < indexes.size(); i++) {
            if(indexes.get(i)==0){
                deleteFirst();
                return;
            }else if(indexes.get(i)==size-1){
                deleteLast();
                return;
            }
            deleteByIndex(indexes.get(i));
        }
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value +" -> " );
            temp=temp.next;
        }
        System.out.println("END" );
    }

}
