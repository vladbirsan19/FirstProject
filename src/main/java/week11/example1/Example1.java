package week11.example1;

public class Example1 {

    // starting point of main thread
    public static void main(String[] args) throws InterruptedException {

        EvenNumberThread t1 = new EvenNumberThread(); // NEW

        // t1.run(); // if you call .run() the code will be executed on the same thread
        t1.start(); // RUNNABLE

        Thread.sleep(2000);

        System.out.println("END " + Thread.currentThread().getName());
    }
}
