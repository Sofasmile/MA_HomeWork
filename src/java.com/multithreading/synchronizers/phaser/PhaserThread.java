package multithreading.synchronizers.phaser;

import java.util.concurrent.Phaser;

public class PhaserThread extends Thread {
    private Phaser phaser;
    private String name;

    PhaserThread(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " performs phase " + phaser.getPhase());
            phaser.arriveAndAwaitAdvance();
            sleep(200);
            System.out.println(name + " performs phase " + phaser.getPhase());
            phaser.arriveAndAwaitAdvance();
            sleep(200);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(name + " performs phase " + phaser.getPhase());
        phaser.arriveAndDeregister();
    }
}
