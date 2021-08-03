package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        printList(list);

        List<String> strings = new ArrayList<>();
        strings.add("Pune");
        strings.add("Mumbai");
        strings.add("Nagpur");
        printList(strings);

        List list1 = new ArrayList();
        list1.add("Kolhapur");
        list1.add(10);
        list1.add('s');
        printList(list1);


    }

    public static void printList(List<?> list){
        list.forEach(s->{
            System.out.println(s);
        });
    }
}
