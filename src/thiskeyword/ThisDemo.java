package thiskeyword;

/**
 *
 * this ->it refers the current class instance variable
 *         it invoke the current class methods
 *         it invoke the current class constructor
 */
public class ThisDemo {

    //instance variable
    int id;
    String name;
    String address;


    public ThisDemo(int id,String name,String address){//local
//        this();
        this.id = id;
        this.name = name;
        this.address = address;
//        id = empId;
//        name = empName;
//        address = empAddress;
    }

    public ThisDemo(){
        this(1,"name","pune");
        System.out.println("In default const");
    }

    public void show(){
        System.out.println("id=>"+id+" name=>"+name+" address=>"+address);
    }


    public void display(){
//        StaticDemo.show();
        this.show();
    }
    public static void main(String[] args) {
        ThisDemo obj = new ThisDemo(1,"Akash","Pune");
        ThisDemo obj1 = new ThisDemo();
        obj.display();
    }
}
