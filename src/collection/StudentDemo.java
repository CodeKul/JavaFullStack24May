package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDemo implements Comparable<StudentDemo> {
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
        StudentDemo obj = new StudentDemo(1,"Akash","Pune");
        StudentDemo obj1 = new StudentDemo(2,"Ravi","Sangli");
        StudentDemo obj2 = new StudentDemo(3,"Kiran","Satara");

        List<StudentDemo> list =  new ArrayList<>();
        list.add(obj1);
        list.add(obj);
        list.add(obj2);

        Collections.sort(list);

        System.out.println(list);


    }

    @Override
    public int compareTo(StudentDemo studentDemo) {
        if(this.id ==studentDemo.id){
            return 0;
        }else if(this.id> studentDemo.id){
            return 1;
        }else {
            return -1;
        }
    }

//    @Override
//    public int compareTo(StudentDemo studentDemo) {
//        return this.address.compareTo(studentDemo.address);
//    }
}
