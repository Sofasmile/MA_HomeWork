package executors.callable.futere;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

public class CallableAndFutureApplication {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(2);

        Callable<Long> callable1 = new Factorial(5);
        Callable<Long> callable2 = new Factorial(8);
        Callable<Long> callable3 = new Factorial(12);
        Callable<Long> callable4 = new Factorial(15);
        Callable<Long> callable5 = new Factorial(10);

        List<Future<Long>> returnedValues = service.invokeAll(Arrays.asList(
                callable1, callable2, callable3, callable4, callable5));
        for (Future<Long> value : returnedValues) {
            System.out.println(value.get());
        }
        service.shutdown();
    }
}
