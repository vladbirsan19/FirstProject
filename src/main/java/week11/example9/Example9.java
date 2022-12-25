package week11.example9;

import java.util.concurrent.*;

// SUBMIT
public class Example9 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(4);

        Runnable r1 = () -> System.out.println("hi");
        // ? - means that we don't know the type of the return
        // we can at least check if the task was completed
        Future<?> future = service.submit(r1);
        // do a lot of stuff
        Object o = future.get();
        // task not ready -> then you have to wait(that's why the InterruptedException)
        // task ready -> get() returns the value

        Callable<String> c1 = () -> "Vlad";
        Future<String> callableFuture = service.submit(c1);
        String myString = callableFuture.get();
        System.out.println(myString);

        service.shutdown();
    }
}
