package executors.scheduled;

import java.util.concurrent.Callable;

public class MathOperation implements Callable<Integer> {
    private int a;
    private int b;

    public MathOperation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() throws Exception {
        return a + b;
    }
}