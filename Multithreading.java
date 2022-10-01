public class Multithreading extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        Multithreading t1 = new Multithreading();
        Multithreading t2 = new Multithreading();
        t1.start();
        t2.start();
    }
}