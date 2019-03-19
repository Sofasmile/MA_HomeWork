package executors.join;

import java.util.concurrent.RecursiveTask;

import static executors.join.ForkJoinPoolApplication.numberOfThread;

public class SumCounting extends RecursiveTask<Long> {
    private long from;
    private long to;

    public SumCounting(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long compute() {
        if ((to - from) <= (to / numberOfThread)) {
            long result = 1;
            for (long i = from; i < to; i++) {
                result++;
            }
            return result;
        } else {
            long middle = (to + from) / 2;
            SumCounting first = new SumCounting(from, middle);
            first.fork();
            SumCounting second = new SumCounting(middle + 1, to);
            long secondValue = second.compute();
            return first.join() + secondValue;
        }
    }
}
