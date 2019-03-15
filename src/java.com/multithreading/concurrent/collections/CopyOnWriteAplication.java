package multithreading.concurrent.collections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteAplication {
    private static List<String> list = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {
        list.add("Book №1");
        list.add("Book №2");
        list.add("Book №3");
        list.add("Book №4");
        list.add("Book №5");
        new Thread(new Runnable() {
            @Override
            public void run() {
                Iterator<String> itrList = list.iterator();
                while (itrList.hasNext()) {
                    String str = itrList.next();
                    System.out.println("Thread1:" + str);
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                list.add("Book №6");
                Iterator<String> itrList = list.iterator();
                while (itrList.hasNext()) {
                    String str = itrList.next();
                    System.out.println("Thread2:" + str);
                }
            }
        }).start();
    }
}
