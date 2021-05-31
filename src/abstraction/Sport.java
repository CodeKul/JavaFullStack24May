package abstraction;

public abstract class Sport {

    Sport(){
        System.out.println("In Cont");
    }

    public abstract void play();//declaring method

    public void exercise(){//defining method
        System.out.println("Do exercise");
    }
}
