package polymorphism;

import java.util.List;

/**
 * Polymorphism -> the ability to take one form to many form
 * or
 * one thing have many action
 */

public class PolyDemo {
    //Method overloading => a class has multiple method with same name
    // having different numbers of argument

    //Rules => 1. changing  the datatype 2. changing the argument/parameter
    //advantage => it increase the readability of program

    //static binding -> early binding -> compile time polymorphism
    public int add(int i,int j){
        return i+j;
    }

    public double add(double  i,int j){
        return i+j;
    }

    public int add(int i ,int j,int k){
        return i+j+k;
    }

    public static void main(String[] args) {

        PolyDemo obj = new PolyDemo();
        System.out.println(obj.add(2,4));


    }

}
