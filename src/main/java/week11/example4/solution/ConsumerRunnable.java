package week11.example4.solution;

import static week11.example4.problem.Example4.bucket;

public class ConsumerRunnable implements Runnable {

    @Override
    public void run() {
        while (true) {
            // IN ORDER TO BE EXECUTED WITHOUT INTERRUPTION -> SYNCHRONIZED
            // NO OTHER THREAD CAN ENTER THIS BLOCK OF CODE
            // UNTIL THE ONE THAT HAS ENTERED FINISHED THE BLOCK OF CODE
            // TO ACHIEVE THIS -> WE USE LOCKS / MONITORS
            synchronized (bucket) { // MONITOR DECIDES WHO ENTERS THE BLOCK OF CODE
                // LIKE A POLICE OFFICER AT A CROSSROAD
                // ANY OBJECT CAN BE A MONITOR (including this keyword)
                // BUT IT DEPENDS ON WHAT WE ARE TRYING TO ACHIEVE
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
}
