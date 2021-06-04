package operators;

import java.util.ArrayList;
import java.util.List;

public class UpDownCasting {
    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.show();

        Child child = new Child();
        child.msg();
        child.show();

        Parent obj = new Child();//upcasting
        Child obj1 = (Child) new Parent();//downcasting

    }
}

class Parent{

    public void show(){
        System.out.println("In show");
    }

}

class Child extends Parent{

    public void msg(){
        System.out.println("In child");
    }
}