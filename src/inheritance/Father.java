package inheritance;

public class Father extends GrandFather {//child class , sub class, derived class


    public void display(){
        System.out.println("id=>"+id+" name=>"+name);
    }


    public static void main(String[] args) {

        Father father = new Father();
        father.id=2;
        father.name = "Ravi";
        father.display();


    }
}
