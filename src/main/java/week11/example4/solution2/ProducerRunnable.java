package week11.example4.solution2;

import java.util.Random;

import static week11.example4.solution.Example4.bucket;

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
                    bucket.notifyAll(); // BLOCKED -> RUNNABLE
                    System.out.println(Thread.currentThread().getName() +
                            " added value " + number + " to the bucket");
                } else {
                    try {
                        bucket.wait(); // RUNNING -> BLOCKED
                        // .wait() & .notifyAll() must always
                        // be called from synchronized block
                        // always from the monitor
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
            // code not synchronized
        }
        // code not synchronized
    }
}
