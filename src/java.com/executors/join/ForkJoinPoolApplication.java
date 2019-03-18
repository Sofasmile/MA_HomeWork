package executors.join;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinPoolApplication {
    public static int numberOfThread = Runtime.getRuntime().availableProcessors();
    public static long count = 1_000_000_000L;

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool(numberOfThread);

        System.out.println("Count of therad: " + numberOfThread);
        System.out.println(forkJoinPool.invoke(new Operation(0, count)));
    }
}
