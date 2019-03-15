package multithreading.locks.readwritelock;

public class Operation {
    private int a;

    public Operation(int a) {
        this.a = a;
    }

    public long square(int a) {
        return a * a;
    }

    public long cube(int a) {
        return a * a * a;
    }

    public void increment() {
        a++;
    }

    public int get() {
        return a;
    }
}
