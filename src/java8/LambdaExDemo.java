package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Lambda expression is anonymous function
 * declaration => (parameter1,parameter2)->{ }
 * uses -> it takes very less code, it provide implementation of functional interface
 */
public class LambdaExDemo {

    public void show(){}
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        list.forEach(consumer);


        MyInterface myInterface =()->{
            return "Good Morning";
        };

        System.out.println(myInterface.msg());

        MyInterface2 myInterface2 = new MyInterface2() {
            @Override
            public int add(int i, int j) {
                return i+j;
            }
        };

        System.out.println(myInterface2.add(3,5));

    }
}

@FunctionalInterface
interface MyInterface{
    String msg();
    default String display(){
        return "String";
    };
}

@FunctionalInterface
interface MyInterface2{
    int add(int  i,int j);
}