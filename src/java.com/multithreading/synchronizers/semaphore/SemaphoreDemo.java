package multithreading.synchronizers.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        Cooking cooking1 = new Cooking("First");
        cooking1.setFood(semaphore);
        cooking1.start();

        Cooking cooking2 = new Cooking("Second");
        cooking2.setFood(semaphore);
        cooking2.start();

        Cooking cooking3 = new Cooking("Third");
        cooking3.setFood(semaphore);
        cooking3.start();

        Cooking cooking4 = new Cooking("Fourth");
        cooking4.setFood(semaphore);
        cooking4.start();
    }
}
