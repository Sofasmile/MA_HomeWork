package multithreading.synchronizers.barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Candy extends Thread {
    private int candyNumber;
    private CyclicBarrier cyclicBarrier;

    public Candy(int candyNumber, CyclicBarrier cyclicBarrier) {
        this.candyNumber = candyNumber;
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        try {
            System.out.println("Candy: " + candyNumber + " is waiting near box.");
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
