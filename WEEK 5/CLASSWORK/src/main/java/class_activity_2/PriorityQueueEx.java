package src.main.java.class_activity_2;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(5);
        queue.add(4);
        queue.add(3);

        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()){
            Integer value = iterator.next();
            System.out.println(value);
        }
    }
}