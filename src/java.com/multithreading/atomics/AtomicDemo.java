package multithreading.atomics;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {
    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger(0);
        new Thread(new CountThread(count, "FirstThread")).start();
        new Thread(new CountThread(count, "SecondThread")).start();
        new Thread(new CountThread(count, "ThirdThread")).start();
        new Thread(new CountThread(count, "FourthThread")).start();
        new Thread(new CountThread(count, "FifthThread")).start();
    }

}

