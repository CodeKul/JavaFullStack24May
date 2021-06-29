package multithreading;

public class ThreadMethods {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        Thread t1 = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        t1.setName("test");
        t1.start();

        Thread t2 = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        t2.start();

        System.out.println(t1.isAlive());
    }
}
