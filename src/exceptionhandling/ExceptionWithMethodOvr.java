package exceptionhandling;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionWithMethodOvr {

    public void show() throws Exception{
        System.out.println("In Show");
    }

    public static void main(String[] args) {

    }
}

class ChildMethodOvr extends ExceptionWithMethodOvr{

    @Override
    public void show() throws Exception {
        try {
            int a =10;
            int b=0;
            int c=0;
            c =a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println(e);
        }


        System.out.println("in child class");
    }

}

class MainMethodOvr{

    public static void main(String[] args) throws Exception {
        //Reference                  //Object
        ExceptionWithMethodOvr obj = new ExceptionWithMethodOvr();
        obj.show();
    }
}

//1. If parent class declare no exception then in child class we declare only unchecked exception
//2. If parent class declare exception then in child class we declare same exception
//2. If parent class declare exception then in child class we declare child exception