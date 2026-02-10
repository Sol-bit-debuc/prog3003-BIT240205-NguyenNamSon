package ExOne;

public class Main {
    public static void main(String[] args) {

        WorkerThread t1 = new WorkerThread();
        t1.start();

        Thread t2 = new Thread(new WorkerRunnable());
        t2.start();
    }
}