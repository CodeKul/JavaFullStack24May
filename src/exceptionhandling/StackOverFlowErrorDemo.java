package exceptionhandling;

public class StackOverFlowErrorDemo {

    private void rec(int num){
        System.out.println("num=>"+num);

        if(num==0){
            return;
        }else {
            rec(num);
        }
    }

    public static void main(String[] args) {
        StackOverFlowErrorDemo obj = new StackOverFlowErrorDemo();
        obj.rec(10);

    }
}
