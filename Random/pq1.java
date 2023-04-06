package Random;

import java.util.PriorityQueue;

public class pq1 {
    public static void main(String[] args) {
        // PriorityQueue<Integer> priorityQueue = new
        // PriorityQueue<>(Comparator.reverseOrder());
        // priorityQueue.add(5);
        // priorityQueue.add(3);
        // priorityQueue.add(1);
        // priorityQueue.add(4);
        // priorityQueue.add(2);
        // System.out.println(priorityQueue + " -> " + priorityQueue.poll());
        // System.out.println(priorityQueue + " -> " + priorityQueue.poll());
        // System.out.println(priorityQueue + " -> " + priorityQueue.poll());
        // System.out.println(priorityQueue + " -> " + priorityQueue.poll());
        PriorityQueue<pqprops> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new pqprops("Tarun", 350));
        priorityQueue.add(new pqprops("Chai", 300));
        priorityQueue.add(new pqprops("Ved", 375));
        priorityQueue.add(new pqprops("Uncle", 1000));
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
    }
}
