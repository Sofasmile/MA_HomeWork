package multithreading.synchronizers.phaser;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        new Thread(new PhaserThread(phaser, "PhaseThread 1")).start();
        new Thread(new PhaserThread(phaser, "PhaseThread 2")).start();

        int phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + phase + " is completed");

        phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + phase + " is completed");

        phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + phase + " is completed");

        phaser.arriveAndDeregister();
    }
}
