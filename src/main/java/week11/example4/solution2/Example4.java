package week11.example4.solution2;

// PRODUCER - CONSUMER PROBLEM

// SHARED RESOURCE (BUCKET) -> USED BY MULTIPLE THREADS - 2 kinds
// 1 THREAD - CONSUMER -> TAKES SOMETHING FROM THE BUCKET
// 2 THREAD - PRODUCER -> PUTS SOMETHING IN THE BUCKET

import java.util.ArrayList;
import java.util.List;

// RACE CONDITION - WHEN TRYING TO ACCESS THE SAME RESOURCE
// THIS IS SOLVED WITH SYNCHRONIZATION
public class Example4 {

    public static final List<Integer> bucket = new ArrayList<>();

    public static void main(String[] args) {

        Thread c1 = new Thread(new ConsumerRunnable(), "C1");
        Thread c2 = new Thread(new ConsumerRunnable(), "C2");
        Thread p1 = new Thread(new ProducerRunnable(), "P1");
        Thread p2 = new Thread(new ProducerRunnable(), "P2");

        // unexpected results
        p1.start();
        p2.start();
        c1.start();
        c2.start();

    }
}
