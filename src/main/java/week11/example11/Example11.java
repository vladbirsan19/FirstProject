package week11.example11;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Example11 {
    public static void main(String[] args) throws InterruptedException {
        var service = Executors.newScheduledThreadPool(4);
        Runnable r1 = () -> System.out.println("Hi");

        service.scheduleAtFixedRate(r1, 3, 5, TimeUnit.SECONDS);

        Thread.sleep(20000);
        service.shutdown();

    }
}
