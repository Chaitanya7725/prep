package Queues;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueues {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>((  o1,o2)-> { return o2 > o1 ? 1:-1; });
        priorityQueue.add(9);
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(7);
        priorityQueue.add(99);
        priorityQueue.add(10);
        System.out.println(priorityQueue);
        Iterator<Integer> iterator=priorityQueue.iterator();
        while(iterator.hasNext())
            System.out.println(priorityQueue.poll());
    }
}
