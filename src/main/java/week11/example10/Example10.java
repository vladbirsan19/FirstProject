package week11.example10;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example10 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);

        Future<Integer> future = service.submit(new AddNumbersCallable(50, 50));

        try {
            Integer computedSum = future.get();
            System.out.println(computedSum + computedSum);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


        service.shutdown();

    }
}
