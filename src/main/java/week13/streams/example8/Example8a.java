package week13.streams.example8;

import java.util.stream.Stream;

//parallel streams
//combination of thread poop + stream api
public class Example8a {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .parallel()
                // other operations - done in parallel
                // .forEachOrdered() - takes care of synchronization
                // will print data from the same thread
                .forEachOrdered(n -> System.out.println(Thread.currentThread().getName() + " " + n));

    }
}
