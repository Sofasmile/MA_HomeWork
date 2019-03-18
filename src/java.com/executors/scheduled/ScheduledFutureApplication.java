package executors.scheduled;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;

public class ScheduledFutureApplication {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
        ScheduledFuture<Integer> scheduleFuture1 = ses.schedule(new MathOperation(5, 10), 3, TimeUnit.SECONDS);
        ScheduledFuture<Integer> scheduleFuture2 = ses.schedule(new MathOperation(10, 10), 4, TimeUnit.SECONDS);

        ScheduledFuture<Integer> scheduleFuture3 = ses.schedule(new MathOperation(15, 10), 5, TimeUnit.SECONDS);

        System.out.println("remaining delay thread 1: " + scheduleFuture1.getDelay(TimeUnit.SECONDS));
        System.out.println("remaining delay thread 2: " + scheduleFuture2.getDelay(TimeUnit.SECONDS));
        System.out.println("remaining delay thread 3: " + scheduleFuture3.getDelay(TimeUnit.SECONDS));

        System.out.println(scheduleFuture1.get());
        System.out.println(scheduleFuture2.get());
        System.out.println(scheduleFuture3.get());
        ses.shutdown();
    }
}
