package controlstatment;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        int num;
        int guess;
        int trials=0;
        Scanner scanner = new Scanner(System.in);

        num = (int)(Math.random()*100)+1;

        do {
            System.out.println("Enter the guess number");
            guess = scanner.nextInt();

            trials++;
            if(num>guess){
                System.out.println("Number is greater");
            }else if(num<guess){
                System.out.println("Number is smaller");
            }else {
                System.out.println("You guess correct....!"+trials);
            }
        }while (num!= guess);
    }
}
