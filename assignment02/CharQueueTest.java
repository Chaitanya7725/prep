package assignment02;

public class CharQueueTest {
    public static void main(String[] args) {
        StringBuilder bldr = new StringBuilder();
        CharQueue queue = new CharQueueImpl(bldr);

        queue.enQueue('1');
        queue.enQueue('1');
        queue.enQueue('2');
        queue.enQueue('2');
        System.out.println(queue.isEmpty());
        System.out.println(queue.remove('2'));
        System.out.println(queue.remove('3'));
        System.out.println(queue.deQueue());
        System.out.println(queue.remove('2'));
        System.out.println(queue.deQueue());
        System.out.println(queue.isEmpty());
        System.out.println(queue.remove('2'));

    }


}
