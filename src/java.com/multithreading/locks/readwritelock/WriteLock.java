package multithreading.locks.readwritelock;

import java.util.concurrent.locks.Lock;

public class WriteLock extends Thread {
    private Operation operation;
    private Lock writeLock;

    public WriteLock(String name, Operation operation, Lock writeLock) {
        super.setName(name);
        this.writeLock = writeLock;
        this.operation = operation;
    }

    @Override
    public void run() {
        System.out.println(super.getName() + ": start working");
        while (operation.get() < 5000) {
            writeLock.lock();
            operation.increment();
            writeLock.unlock();
        }
        System.out.println(super.getName() + ": finished working");
    }
}
