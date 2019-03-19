package executors.join;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinPoolApplication {
    public static final int numberOfThread = Runtime.getRuntime().availableProcessors();
    public static final long count = 1_000_000_000L;

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool(numberOfThread);

        System.out.println("Count of therad: " + numberOfThread);
        System.out.println(forkJoinPool.invoke(new SumCounting(0, count)));
    }
}
