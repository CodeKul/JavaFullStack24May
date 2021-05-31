package polymorphism;

import java.util.List;

public class Animal {
    //method overriding => if two classes have same method name with same parameter
    //advantage -> you are changing existing method of parent class

    //dynamic binding -> late binding -> Runtime polymorphism
    public void sound(){
        System.out.println("animal sound");
    }
}

class Cat extends Animal{

    @Override
    public void sound() {
        System.out.println("Cat sound");
    }

    public static void main(String[] args) {
        Animal obj = new Cat();//dynamic dispatch method
        obj.sound();
    }

}

class Dog extends Animal{

    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();
    }
}