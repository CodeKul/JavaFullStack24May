package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//Linkedlist Store duplicate element
//Linkedlist maintains insertion order
//Linkedlist uses doubley linked list to store element

public class LinkedListDemo {

    public static void main(String[] args) {


        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.forEach(s->{
//            System.out.println(s);
        });

        System.out.println(list.get(1));
        System.out.println(list.indexOf(20));


        List<Integer> list1 = new LinkedList<>();
        list1.add(50);
        list1.add(60);
        list1.add(70);


        list.addAll(list1);
        list.forEach(s->{
            System.out.println(s);
        });
    }
}
