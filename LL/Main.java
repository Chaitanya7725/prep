package LL;

public class Main {
    public static void main(String[] args) {
        LLC list=new LLC();
        list.insertFirst(6);
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(6);
        list.insertFirst(2);
        list.insertFirst(1);
        list.display();
//        list.insertLast(5);
//        list.display();
//        list.insert(6,2);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.deleteByIndex(2));
//        list.display();
        list.deleteByValue(6);
        list.display();



//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.display();
//        list.insertLast(20);
//        list.display();
//        list.insert(100,3);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();
//        list.update(2,4);
//        list.display();
    }
}
