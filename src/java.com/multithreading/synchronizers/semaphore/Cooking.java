package multithreading.synchronizers.semaphore;

import java.util.concurrent.Semaphore;

public class Cooking extends Thread {
    private Semaphore cookstove;

    public void setFood(Semaphore cookstove) {
        this.cookstove = cookstove;
    }

    public Cooking(String name) {
        super.setName(name);
    }

    @Override
    public void run() {
        try {
            System.out.println(super.getName() + ": waiting for free cookstove");
            cookstove.acquire();
            System.out.println(super.getName() + ": cook some dishes");
            sleep(1000);
            System.out.println(super.getName() + ": finished cooking");
            cookstove.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
