package java8;

public class DefaultStaticKeyword implements MyInterface3,MyInterface4 {

    public static void main(String[] args) {

        DefaultStaticKeyword obj = new DefaultStaticKeyword();
        obj.msg();
        obj.add();
        MyInterface3.sub();

    }

    @Override
    public String msg() {
        return "Good Morning";
    }

    @Override
    public void add() {
        System.out.println("in class");
    }

}

interface MyInterface3{
    String msg();//declare method

    default void add(){//define method
        System.out.println("In add method");
    };

    static void sub(){//define method
        System.out.println("In static method");
    }
}

interface MyInterface4{

    default void add(){
        System.out.println("In Interface 4");
    }

}
