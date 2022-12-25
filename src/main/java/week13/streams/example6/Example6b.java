package week13.streams.example6;

import java.util.stream.Stream;

public class Example6b {
    public static void main(String[] args) {
        Stream<Student> studentStream= Stream.of(
                new Student(20),
                new Student(10),
                new Student(50)
        );
        studentStream
                .sorted()
                .forEach(System.out::println);
    }
}
