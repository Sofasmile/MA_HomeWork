package multithreading.locks.lock;

import java.util.Random;

public class ListOfNumbers {
    Random rand = new Random();
    private int[] array;

    public ListOfNumbers(int size) {
        array = new int[size];
    }

    public void writeNumber() {
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
    }

    public int size() {
        return array.length;
    }
}
