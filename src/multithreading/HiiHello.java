package multithreading;

public class HiiHello {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(()-> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hii");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t1.join();

        Runnable r2 = ()-> {
            for (int i=1;i<=5;i++){
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t2 = new Thread(r2);
        t2.start();
        t2.join();

        System.out.println("Bye");

    }
}
