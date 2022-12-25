package week13.streams.example2;

import org.postgresql.shaded.com.ongres.scram.common.bouncycastle.pbkdf2.Integers;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Example2 {

    // how to create a stream
    public static void main(String[] args) {

        //finite source
        Stream<Integer> s1 = Stream.empty();
        //finite source
        Stream<Integer> s2 = Stream.of(1, 2, 3, 5, 9);
        s2.forEach(System.out::println);

        //infinite source - runs continuously
        Supplier<Integer> supplier = () -> new Random().nextInt(1000);
        Stream<Integer> s3 = Stream.generate(supplier);
        s3.forEach(n -> System.out.println(n));

        //infinite source with limit
        Stream<Integer> s4 = Stream.generate(supplier).limit(10);
        s4.forEach(System.out::println);

        Stream<Integer> s5 = Stream.iterate(1, i -> i + 1);
        s5.limit(10)
                .forEach(System.out::println);


    }
}
