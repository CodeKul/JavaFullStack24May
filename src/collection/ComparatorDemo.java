package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    Integer id;
    String name;
    String address;

    public ComparatorDemo(Integer id, String name, String address) {
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

    public static void main(String[] args) {
        ComparatorDemo obj1 = new ComparatorDemo(1,"Ravi","Pune");
        ComparatorDemo obj2 = new ComparatorDemo(1,"Kishan","Mumbai");
        ComparatorDemo obj3 = new ComparatorDemo(3,"Prakash","Sangli");
        ComparatorDemo obj4 = new ComparatorDemo(4,"Kiran","Sangli");

        List<ComparatorDemo> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj4);
        list.add(obj3);
        list.add(obj2);

        Comparator<ComparatorDemo> comparator = new Comparator<ComparatorDemo>() {
            @Override
            public int compare(ComparatorDemo t1, ComparatorDemo t2) {
                if(t1.id==t2.id){
                    return 0;
                }else if(t1.id>t2.id){
                    return 1;
                }else {
                    return -1;
                }
            }
        };

        Comparator<ComparatorDemo> comparator1 = new Comparator<ComparatorDemo>() {
            @Override
            public int compare(ComparatorDemo comparatorDemo, ComparatorDemo t1) {
                return comparatorDemo.name.compareTo(t1.name);
            }
        };
        Collections.sort(list,comparator.thenComparing(comparator1));

        list.forEach(s->{
            System.out.printf("id=>"+s.id+" "+"name=>"+s.name+" "+" address=>"+s.address+" ");
        });
    }
}
