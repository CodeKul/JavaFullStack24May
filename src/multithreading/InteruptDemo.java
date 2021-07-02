package multithreading;

//Interrupt = > If thread is in sleep or wait state then calling interrupt we interrupt the thread

public class InteruptDemo extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println("in Run =>" + i);
                sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        InteruptDemo obj = new InteruptDemo();
        obj.start();
        obj.interrupt();

        System.out.println(obj.isInterrupted());
    }
}
