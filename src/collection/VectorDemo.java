package collection;

import java.util.List;
import java.util.Vector;

//Vector Store duplicate element
//Vector maintains insertion order
//default size is 10 it increase by 100%

public class VectorDemo {
    public static void main(String[] args) {
        List<Integer> list = new Vector<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.forEach(s->{
            System.out.println(s);
        });
    }
}
