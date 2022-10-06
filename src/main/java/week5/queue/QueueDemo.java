package week5.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;



    public class QueueDemo {

        public static void main(String[] args) {

            Queue queue = new PriorityQueue();

            queue.add("abcd");
            queue.add("zyx");
            queue.add("dhg");

            System.out.println(queue);

            System.out.println("After remove");
            queue.remove("abcd");
            System.out.println(queue);

            System.out.println("With iterator");
            Iterator iterator = queue.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

            System.out.println("----------------");
            System.out.println(queue.peek());
            System.out.println(queue);

            System.out.println("----------------");
            System.out.println(queue.poll());

            System.out.println(queue);

        }
    }


