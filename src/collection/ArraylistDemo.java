package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
//Arraylist is Class
//Arraylist Store duplicate element
//Arraylist maintains insertion order
//Arraylist uses dynamic array to store the element
//default size of arraylist is 10  it increase size by 50%

public class ArraylistDemo {

    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(70);
        list.add(30);
        list.add(40);

        for(Integer i:list){
            System.out.println(i);
        }

        list.forEach(s -> {
            System.out.println(s);
        });

        System.out.println(list.size());
        System.out.println(list.contains(10));
        System.out.println(list.get(3));
        System.out.println(list.equals(Integer.valueOf(20)));

        Iterator<Integer> iterator = list.iterator();

//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        List<Integer> list1 = Arrays.asList(1, 2, 4, 4, 5);

        List<Integer> list2 = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        List<Integer> list3 = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
        }};
    }
}
