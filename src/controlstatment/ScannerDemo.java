package controlstatment;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        int i;
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value");
        i = scanner.nextInt();
        System.out.println("Enter the string value");
        str = scanner.next();

        System.out.println("Your entered value is "+i);
        System.out.println("Your entered value is  string "+str);

    }
}
