package finalkeyword;

public class FinalDemo { //class -> can not inherit

    final int i = 10;//constant //variable -> can not change the value

    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
//        obj.i = 90;
//        System.out.println(obj.i);
//        System.out.println(obj.i);
        obj.show();

    }

    public void show() {//method -> can not override
//        i = 5;
        System.out.println(i);
    }
}

class Final2Demo extends FinalDemo {

    @Override
    public void show() {
        System.out.println("In Final 2 show");
    }
}