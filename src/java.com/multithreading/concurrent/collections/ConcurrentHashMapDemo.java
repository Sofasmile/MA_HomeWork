package multithreading.concurrent.collections;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    private final ConcurrentHashMap<Integer, String> hashMap = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        ConcurrentHashMapDemo ob = new ConcurrentHashMapDemo();
        new Thread(ob.new FirstThread()).start();
        new Thread(ob.new SecondThread()).start();
        new Thread(ob.new ReadThread()).start();
    }

    class FirstThread implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                hashMap.put(i, "A");
            }
        }
    }

    class SecondThread implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                hashMap.put(i, "B");
            }
        }
    }

    class ReadThread implements Runnable {
        @Override
        public void run() {
            Iterator<Integer> ite = hashMap.keySet().iterator();
            while (ite.hasNext()) {
                Integer key = ite.next();
                System.out.println(key + ") - " + hashMap.get(key));
            }
        }
    }
}
