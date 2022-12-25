package week13.streams.example1;

import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 5, 6, 3, 8, 9);

        //printing even numbers -without streams

        for (Integer i : list) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //printing even numbers - with streams
        // nicer , more fluid

        list.stream() //source
                .filter(i -> i % 2 == 0) //intermediary operation
                .forEach(i -> System.out.println(i)); // terminal operation

        //poetry
        list.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println); // method reference
    }
}
