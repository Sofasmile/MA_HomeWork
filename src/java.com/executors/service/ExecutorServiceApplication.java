package executors.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceApplication {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.execute(new Job("Thread-1"));
        executor.execute(new Job("Thread-2"));
        executor.execute(new Job("Thread-3"));
        executor.execute(new Job("Thread-4"));
        executor.execute(new Job("Thread-5"));

        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
}
