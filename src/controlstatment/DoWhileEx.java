package controlstatment;

import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {

        int i;
        int sum=0;
        char choice;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the Number");
            i = scanner.nextInt();
            sum= sum+i;
            System.out.println("Want to enter number type Y for continue or for exit type N");
            choice = scanner.next().charAt(0);


        }while (choice=='Y' ||choice=='y');

        System.out.println("sum is=>"+sum);

    }
}
