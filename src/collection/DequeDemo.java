package collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeDemo {
//    Deque = double ended queue
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.add(20);
        deque.addLast(30);
        deque.addFirst(40);

//        System.out.println(deque);
//
//        System.out.println(deque.peek());
//        System.out.println(deque.pop());
//        System.out.println(deque.pollFirst());
//        System.out.println(deque.pollLast());
//
        deque.forEach(s->{
            System.out.println(s);
        });

        System.out.println();

        for(Iterator iterator = deque.descendingIterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }

    }
}
