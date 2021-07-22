package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        //FIFO (first in first out)
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);//when queue is full then return exception
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

//        System.out.println(queue);
//        System.out.println(queue.peek());//return top/head , if queue is empty then it return null
//        System.out.println(queue.element());//retrun top/head, if queue is empty then return exception
//        System.out.println(queue.remove());//return exception when queue is empty
//        System.out.println(queue.poll());// return null when queue is empty
        System.out.println(queue.isEmpty());
        System.out.println(queue.offer(60));//when queue is full then it return false
        System.out.println(queue.remove(50));
        System.out.println(queue);

    }
}
