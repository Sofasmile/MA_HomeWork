package executors.thread.pool;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Running: " + Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Completed: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
