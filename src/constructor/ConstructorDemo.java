package constructor;

public class ConstructorDemo {

    /**
     *Constructor -> Constructor is special type of function
     *  which execute when you create object of your class
     *
     * RULE ->
     * 1. Constructor name is same as class name
     * 2. there is no return type to Constructor
     * 3. we can not use abstract,final,static,synchronized keyword
     *
     * types->
     * parameterized
     * default
     *
     * purpose -> it initialized variables to their default values
     *
     */

    int id=6;
    String name="sdf";

    public void show(){
        System.out.println("name ->"+name+" id->"+id);
    }

    public ConstructorDemo(int i){

    }

    public ConstructorDemo(){
    }
    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo(9);
        obj.show();
    }
}
