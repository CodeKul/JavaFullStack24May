package exceptionhandling;

import java.util.Scanner;

public class FInallyDemo {

    public static void main(String[] args) {

        int i=10;
        int j;
        Scanner scanner = new Scanner(System.in);//stream
        i = scanner.nextInt();
        j = scanner.nextInt();
        try {
            int k = i/j;
            System.out.println("Hii");
            System.out.println("Hii");
            System.out.println("Hii");
            System.out.println("Hii");
            System.out.println("Hii");
            System.exit(0);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            scanner.close();
        }

    }
}
