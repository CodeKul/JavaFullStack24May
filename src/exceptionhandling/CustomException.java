package exceptionhandling;

public class CustomException {

    public static void main(String[] args) throws MyException {

        int i=0;
        if(i==0){
            throw new MyException("Number is zero");
        } else {
            System.out.println("number is not zero");
        }

    }
}

class MyException extends Exception{

    public MyException(String msg){
        super(msg);
    }

}