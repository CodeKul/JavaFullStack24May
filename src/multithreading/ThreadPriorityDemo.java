package multithreading;

public class ThreadPriorityDemo {

    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
//        t1.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(10);
        t1.start();

        Thread2 t2 = new Thread2();
//        t2.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(1);
        t2.start();

        System.out.println(Thread.currentThread().getPriority());
    }
}

class Thread1 extends Thread{

    @Override
    public void run() {
        System.out.println("In Thread 1");
    }
}

class Thread2 extends Thread{

    @Override
    public void run() {
        System.out.println("In Thread 2");
    }
}