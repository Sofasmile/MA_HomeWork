package multithreading.queues;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {
    public static final int COUNT = 5;
    public static final int CAPACITY = 10;

    public static void main(String[] args) {
        BlockingQueue bq = new ArrayBlockingQueue(CAPACITY);
        new Thread(new Producer(bq, COUNT)).start();
        new Thread(new Consumer(bq, COUNT)).start();
    }
}
