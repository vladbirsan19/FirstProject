package week11.example1;

// this the simplest way in Java to create a Thread (THEORETICAL)
// shouldn't be used for practical purposes
public class EvenNumberThread extends Thread {
    // EvenNumberThread is just a more particular type of Thread (inheritance)
    @Override
    public void run() {
        // printing the even numbers from 0 to 10
        try {
            for (int i = 0; i <= 10; i += 2) {
                Thread.sleep(1000); // BLOCKED
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
