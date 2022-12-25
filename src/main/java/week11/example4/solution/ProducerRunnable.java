package week11.example4.solution;

import java.util.Random;

import static week11.example4.problem.Example4.bucket;

public class ProducerRunnable implements Runnable {

    @Override
    public void run() {
        // code not synchronized
        // MIN LIMIT = 0
        // MAX LIMIT = 100
        Random random = new Random();
        while (true) {
            // code not synchronized
            synchronized (bucket) {
                if (bucket.size() < 100) { // bucket still allows elements inside
                    int number = random.nextInt(1000);
                    bucket.add(number);
                    System.out.println(Thread.currentThread().getName() +
                            " added value " + number + " to the bucket");
                }
            }
            // code not synchronized
        }
        // code not synchronized
    }
}
