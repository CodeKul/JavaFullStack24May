package collection;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {
    Integer id;
    String name;
    String address;

    public StudentDemo(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        StudentDemo obj = new StudentDemo(1,"AKash","Pune");
        StudentDemo obj1 = new StudentDemo(2,"Ravi","Sangli");
        StudentDemo obj2 = new StudentDemo(3,"Kiran","Satara");

        List<StudentDemo> list =  new ArrayList<>();
        list.add(obj1);
        list.add(obj);
        list.add(obj2);

        System.out.println(list);
    }
}
