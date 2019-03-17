package multithreading.synchronizers.barrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier barrier = new CyclicBarrier(3, new BoxOfCandy());
        for (int i = 0; i < 12; i++) {
            new Thread(new Candy(i, barrier)).start();
            Thread.sleep(400);
        }
    }
}
