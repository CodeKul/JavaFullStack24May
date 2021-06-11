package superkeyword;



class A extends Object{//super ,parent
    int i=10;

    public void display(){
        System.out.println("In A display");
    }

    public A(){
        super();
        System.out.println("In constructor A");
    }

    public A(int i){
        System.out.println("In parameterized const");
    }
}

class B extends A{//sub,child

    int i = 6;

    public void show(){
        super.display();
        System.out.println(super.i);
    }

    public B(){

        System.out.println("in B Constructor");
    }

    public B(int i){
        super(1);
        System.out.println("In parameterized B const");
    }
}
class C extends B{

    public C(){
        super();
        System.out.println("In C const");
    }
}
public class SuperDemo {

    public static void main(String[] args) {
//        B obj = new B(7);
//        System.out.println(obj.i);
//        obj.show();
        C obj1 = new C();
    }
}