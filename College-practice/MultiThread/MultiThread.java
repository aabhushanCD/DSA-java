import java.lang.*;

public class MultiThread extends Thread {
    public void run() {
        System.out.println("Thread is running:");
    }

    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        MultiThread m1 = new MultiThread();
        m1.start();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        m1.sum(5, 43);

    }

}
