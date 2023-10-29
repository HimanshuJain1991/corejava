package in.com.threads_example;

class MyThread2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Main {
    public static void main(String args[]) {
        Thread t1 = new Thread(new MyThread2());
        Thread t2 = new Thread(new MyThread2());

        t1.start(); // Start the first thread
        try {
            t1.join(); // Wait for t1 to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start(); // Start the second thread
    }
}

