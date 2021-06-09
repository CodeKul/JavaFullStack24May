package controlstatment;

public class IfElseDemo {

    public static void main(String[] args) {

        int age = 18;
        String nationality = "pak";

        if (age >= 18) {//nested if
            if (nationality == "Indian") {
                System.out.println("You can vote");
            } else {
                System.out.println("Not Indian");
            }
        } else {
            System.out.println("You can not vote");
        }

        int a = 10134, b = 6045646, c = 304, d = 9088;

        if (a > b && a > c && a > d) {//ladder if
            System.out.println("a is greater");
        } else if (b > c && b > d) {
            System.out.println("b is greater");
        } else if (c > d) {
            System.out.println("c is greater");
        } else {
            System.out.println("d is greater");
        }

        int i=1;
        if(i==1){
            System.out.println("one");
        }else if(i==2){
            System.out.println("Two");
        } else if(i==3){
            System.out.println("Three");
        }else {
            System.out.println("Default");
        }

//        int i = 10;
//        if (i > 0) {
//            System.out.println("100");
//        } else {
//            System.out.println("0");
//        }


        String str = i > 0 ? "+ve" : "-ve";
        System.out.println(str);

        int j = i > 0 ? 100 : 0;
        System.out.println(j);


    }
}
