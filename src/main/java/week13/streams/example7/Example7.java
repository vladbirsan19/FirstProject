package week13.streams.example7;

import java.util.List;

// .skip() + .peek()
public class Example7 {
    public static void main(String[] args) {
        List<Integer> list =List.of(1,2,3,4,5,6,7,8,9);

        list.stream()
                .skip(4)// skips the first 4 values
                .forEach(System.out::println);

        System.out.println("**********************************************");
        list.stream()
                .peek(System.out::println)
                .filter(i->i%2==0)
                .forEach(System.out::println);
    }
}
