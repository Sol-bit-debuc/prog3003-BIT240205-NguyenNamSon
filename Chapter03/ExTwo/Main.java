package ExTwo;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            NumberThread t = new NumberThread("Thread-" + i);
            t.start();
        }
    }
}
