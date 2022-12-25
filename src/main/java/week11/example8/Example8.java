package week11.example8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// EXECUTOR SERVICE - HIGH LEVEL MULTITHREADING FRAMEWORK
public class Example8 {

    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();

        ExecutorService service = Executors.newFixedThreadPool(cores); // THREADS
//        ExecutorService service = Executors.newSingleThreadExecutor();
//        ExecutorService service = Executors.newCachedThreadPool();
//        ExecutorService service = Executors.newWorkStealingPool();

        Runnable r1 = () -> System.out.println("Hello " +
                Thread.currentThread().getName()); // TASK / BALL

        service.execute(r1);
        System.out.println("BYE " + Thread.currentThread().getName());


        // ALWAYS NEED TO CLOSE THE EXECUTOR SERVICE
        // OTHERWISE IT WILL RUN INDEFINITELY
        // BEST PRACTICE RECOMMENDS THAT YOU CLOSE THE EXECUTOR
        // IN A FINALLY BLOCK
        service.shutdown(); // closes the pool after the task is finished (graceful exit)
//        service.shutdownNow(); // closes the pool without waiting for the task to finish


    }
}
