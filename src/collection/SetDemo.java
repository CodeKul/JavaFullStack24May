package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        //Set doesn't store duplicate element
        // set doesn't maintain insertion order
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

//        System.out.println(set);

//        LinkedHashSet doesn't store duplicate element
//        it maintains insertion orders
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);

        System.out.println(set1);
    }
}
