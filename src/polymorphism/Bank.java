package polymorphism;

public class Bank {

    public void interest (){
        System.out.println("Default interest is 8%");
    }
}

class SBI extends Bank{


    public static void main(String[] args) {

        SBI obj = new SBI();
        obj.interest();
    }

}

class HDFC extends Bank{
    @Override
    public void interest() {
        System.out.println("10%");
    }
}
