package week11.example5;

import static week11.example5.Main.number;

public class PrintingThread implements Runnable {


    @Override
    public void run() {
        try {
            System.out.println(number); // uses the value
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
