package multithreading.queues;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    protected BlockingQueue queue;
    private int count;


    public Consumer(BlockingQueue queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < count; i++) {
                System.out.println("Consumed: " + queue.take());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
