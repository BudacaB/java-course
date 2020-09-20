package course.chapter16;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        CD cd1 = new CD(1, "The Beatles", "The Beatles 1");
        CD cd2 = new CD(2, "Prince", "The very best of Prince");
        CD cd3 = new CD(3, "Garth Brooks", "The Ultimate Hits");

        Queue<CD> cdCollection = new LinkedList<>();

        cdCollection.offer(cd1);
        cdCollection.offer(cd2);
        cdCollection.offer(cd3);

//        System.out.println("Using peek():");
//        for (int i = 0; i < cdCollection.size(); i++) {
//            System.out.println(cdCollection.peek());
//        }

        System.out.println("Using poll():");
        int size = cdCollection.size();
        for (int i = 0; i < size; i++) {
            System.out.println(cdCollection.poll());
        }
    }
}
