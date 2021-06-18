package exceptionhandling;

public class ThrowDemo {

    public static void main(String[] args)  {


        int age=17;
        if(age>18){
//            throw new Exception("you can not vote");
            System.out.println("Hii");
            System.out.println("Hii");
            System.out.println("Hii");
            System.out.println("Hii");

        }else {
            System.out.println("you can vote");
        }
    }
}

class CustomEx extends Exception{

}