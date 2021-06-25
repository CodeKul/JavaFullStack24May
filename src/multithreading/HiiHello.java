package multithreading;

public class HiiHello {

    public static void main(String[] args) {

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Hii");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=5;i++){
                    System.out.println("Hello");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread t2 = new Thread(r2);
        t2.start();
    }
}
