package multithreading.locks.readwritelock;

import java.util.concurrent.locks.Lock;

public class ReadLock extends Thread {
    private Operation operation;
    private Lock readLock;

    public ReadLock(String name, Operation operation, Lock readLock) {
        super.setName(name);
        this.readLock = readLock;
        this.operation = operation;
    }

    @Override
    public void run() {
        System.out.println(super.getName() + ": start working");
        while (operation.get() < 5000) {
            readLock.lock();
            System.out.println("We use the number: " + operation.get());
            System.out.println(operation.square(operation.get()));
            System.out.println(operation.cube(operation.get()));
            readLock.unlock();
        }
        System.out.println(super.getName() + ": finished working");
    }
}
