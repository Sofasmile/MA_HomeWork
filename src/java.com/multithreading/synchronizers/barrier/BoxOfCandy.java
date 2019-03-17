package multithreading.synchronizers.barrier;

public class BoxOfCandy extends Thread {
    @Override
    public void run() {
        try {
            sleep(200);
            System.out.println("Close the box");
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }
}
