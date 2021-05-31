package inheritance;

public class GrandFather {//parent class , super class , base class
    int id;
    String name;

    public void display(){
        System.out.println("id=>"+id+" name=>"+name);
    }

    public static void main(String[] args) {
        GrandFather grandFather = new GrandFather();
        grandFather.id=1;
        grandFather.name="Sachin";

        grandFather.display();

    }
}
