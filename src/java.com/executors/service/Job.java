package executors.service;

public class Job implements Runnable {
    private String name;

    public Job(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " starting work");
            Thread.sleep(2000);
            System.out.println(name + " finished work");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
