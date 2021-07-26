package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
        List<Integer> list =  new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(80);
        list.add(30);

//        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
//        Collections.reverse(list);
        System.out.println(list);

    }
}
