package multithreading;

public class ThreadDemo {

    public static void main(String[] args) {

        Hii obj = new Hii();
        Thread t1= new Thread(obj);
        t1.start();
//        obj.run();

        Hello obj1 = new Hello();
        obj1.start();
    }
}

class Hii implements Runnable{

    @Override
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("Hii");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hello extends Thread{

    @Override
    public void run()  {
        for (int i=1;i<=5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void show() throws InterruptedException{
        Thread.sleep(500);
    }


}

//new => when you create object of thread and before invocation of start().
//runnable => when start method is invoked but thread scheduler is not selected as running thread
//running => when thread scheduler is selected as running thread.
//Blocking => when thread is waiting or sleep that time thread is in blocking state
//died => after exit of run method



