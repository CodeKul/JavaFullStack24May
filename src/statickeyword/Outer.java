package statickeyword;

public class Outer {

    int id = 1;
    String name = "Suhas";

     static class Inner {

        int id = 2;
         static String name = "Ravi";
    }

}

class MainStatic {

    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.id);

//        Outer.Inner inner =outer.new Inner();
//        System.out.println(inner.name);

        Outer.Inner inner = new Outer.Inner();
        System.out.println(Outer.Inner.name);


        StaticDemo.show();
    }
}