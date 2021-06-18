package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class NestedExDemo {


    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try {
            try {
                i = 10;
                j = i / 0;
                System.out.println(j);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }

//            String str = null;
//            System.out.println(str.length());

            int[] arr = new int[3];
            arr[3] = 10;
            System.out.println("Hello");
            System.out.println("Hello");


        } catch (ArithmeticException a) {
            System.out.println("divide by zero not possible" + a);
        } catch (NullPointerException nullPointerException){
            System.out.println(nullPointerException);
        } catch (Exception e){
            System.out.println("e"+e);
        } finally {
            System.out.println("In finally");
        }

        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");


//        File file = new File("test.txt");
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream(file);
//        } catch (FileNotFoundException fileNotFoundException) {
//            fileNotFoundException.printStackTrace();
//        }


    }
}
