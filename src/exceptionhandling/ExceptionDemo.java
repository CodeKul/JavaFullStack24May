package exceptionhandling;

import java.io.IOException;

public class ExceptionDemo {

    public static void main(String[] args) {

        try {
            String str =null;
            System.out.println(str.length());
        }catch (NullPointerException exception){
            System.out.println(exception);
        }

        try {
            int i=10;
            int j = i/0;
        }catch (ArithmeticException e){
            System.out.println();
        }


//        System.out.println("Hii");
//        System.out.println("Hii");
//        System.out.println("Hii");
//        System.out.println("Hii");
//        System.out.println("Hii");
    }
}
