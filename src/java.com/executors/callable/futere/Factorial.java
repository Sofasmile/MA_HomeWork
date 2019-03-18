package executors.callable.futere;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Long> {
    private int number;

    public Factorial(int number) {
        this.number = number;
    }

    @Override
    public Long call() throws Exception {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
