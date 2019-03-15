package multithreading.locks.lock;

import java.util.concurrent.locks.Lock;

public class FirstThread extends Thread {
    private Lock locker;
    private ListOfNumbers list;

    public FirstThread(String name, Lock lock, ListOfNumbers list) {
        super.setName(name);
        this.locker = lock;
        this.list = list;
    }

    @Override
    public void run() {
        locker.lock();
        System.out.println(super.getName() + ": start working");
        list.writeNumber();
        System.out.println(super.getName() + ": stop working");
        locker.unlock();
    }
}
