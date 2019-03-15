package multithreading.singleton;

import java.lang.reflect.Constructor;

public class SingletonDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton instance1 = Singleton.getInstance();
                System.out.println("Instance 1 hashCode:  " + instance1.hashCode());
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton instance2 = Singleton.getInstance();
                System.out.println("Instance 2 hashCode:  " + instance2.hashCode());
            }
        }).start();

        //Reflection
        Singleton instance3 = Singleton.getInstance();
        Singleton instance4 = null;
        try {
            Class<Singleton> clazz = Singleton.class;
            Constructor<Singleton> cons = clazz.getDeclaredConstructor();
            cons.setAccessible(true);
            instance4 = cons.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Instance 3 hashCode:  " + instance3.hashCode());
        System.out.println("Instance 4 hashCode:  " + instance4.hashCode());

    }
}
