package multithreading.locks;

import multithreading.locks.lock.FirstThread;
import multithreading.locks.lock.ListOfNumbers;
import multithreading.locks.lock.SecondThread;
import multithreading.locks.readwritelock.Operation;
import multithreading.locks.readwritelock.ReadLock;
import multithreading.locks.readwritelock.WriteLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockDemo {
    public static void main(String[] args) {
        //Lock
        Lock lock = new ReentrantLock();
        ListOfNumbers listOfNumbers = new ListOfNumbers(8000);
        new Thread(new FirstThread("WriteThread", lock, listOfNumbers)).start();
        new Thread(new SecondThread("ReadThread", lock, listOfNumbers)).start();

        //ReadWriteLock
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        Lock readLock = readWriteLock.readLock();
        Lock writeLock = readWriteLock.writeLock();
        Operation operation = new Operation(1);
        new Thread(new WriteLock("WriteLock", operation, writeLock)).start();
        new Thread(new ReadLock("ReadThread", operation, readLock)).start();
    }
}
