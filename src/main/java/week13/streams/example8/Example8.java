package week13.streams.example8;

import java.util.stream.Stream;

public class Example8 {
    public static void main(String[] args) {
        // single thread stream
//        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
//                .forEach(n -> System.out.println(Thread.currentThread().getName() + " " + n));

        // parallel thread stream
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                // numbers are not in the same order
                // fork join framework behind the scenes
                // same thread might print more numbers
                .parallel()
                .forEach(n -> System.out.println(Thread.currentThread().getName() + " " + n));

        // parallel streams is not a magic solution
        // using parallel streams is less efficient than a normal(single) stream
        // because of the overhead of maintaining the threads
    }


}


