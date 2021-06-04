package controlstatment;

import java.util.ArrayList;
import java.util.List;

public class ForLoopDemo {

    public static void main(String[] args) {

//        for(int i=1;i<=10;i++){
//            System.out.println(i);
//        }

        //array is collection of elements of same type.
//        array index start from 0
        int[] arr= new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
//        arr[4] = 50;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr.length);

        System.out.println();

        //traditional for loop
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println();
        //for loop enhanced
        for (int i:arr) {
            System.out.println(i);
        }

        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        //for each loop, it is launch in java 8
        list.forEach(s->{
            System.out.println(s);
        });

        //method reference
        list.forEach(System.out::println);



    }

}
