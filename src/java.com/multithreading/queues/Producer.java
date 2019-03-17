package multithreading.queues;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private BlockingQueue blockingQueue;
    private int count;

    public Producer(BlockingQueue queue, int count) {
        this.blockingQueue = queue;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < count; i++) {
                System.out.println("Produced: " + i);
                blockingQueue.put(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
