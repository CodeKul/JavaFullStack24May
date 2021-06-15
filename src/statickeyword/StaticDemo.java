package statickeyword;

public class StaticDemo {

    int id;
    String name;
    static String schoolName;


    static {
        System.out.println("In static block");
        schoolName =  "XYZ";
    }

    public  static void show(){
        System.out.println("In Show method");
    }

    public StaticDemo(){
        System.out.println("In Constructor");
    }

    public static void main(String[] args) {
        StaticDemo obj = new StaticDemo();
        obj.id=1;
        obj.name = "Sachin";

        StaticDemo.show();

        StaticDemo obj1 = new StaticDemo();
        obj1.id = 2;
        obj1.name = "Akash";

        StaticDemo obj2 = new StaticDemo();
        obj2.id = 3;
        obj2.name = "Sujeet";

        System.out.println("id=>"+obj.id+" name=>"+obj.name+" schoolNm=>"+schoolName);
        System.out.println("id=>"+obj1.id+" name=>"+obj1.name+" schoolNm=>"+schoolName);


    }
}
//
//class Inherited extends StaticDemo{
//
//    @Override
//    public void show() {
//        super.show();
//    }
//
//    public static void main(String[] args) {
//        show();
//    }
//}