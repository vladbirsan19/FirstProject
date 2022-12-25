package week11.example5;

import static week11.example5.Main.number;

public class IncrementingThread implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                number++; // changing the value
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
