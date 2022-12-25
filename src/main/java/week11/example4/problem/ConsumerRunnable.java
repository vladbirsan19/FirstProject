package week11.example4.problem;

import static week11.example4.problem.Example4.bucket;

public class ConsumerRunnable implements Runnable {

    @Override
    public void run() {
        while (true) {
            if (!bucket.isEmpty()) {
                // if not empty, at least index 0 has a value
                Integer number = bucket.get(0);
                bucket.remove(0);
                System.out.println(Thread.currentThread().getName() +
                        " consumed value " + number + " from the bucket");
            }
        }
    }
}
