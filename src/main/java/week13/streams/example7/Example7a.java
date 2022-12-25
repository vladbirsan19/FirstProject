package week13.streams.example7;

import java.util.List;

// .takeWhile() .dropWhile()
public class Example7a {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        list.stream()
                // takes number until condition
                .takeWhile(n -> n <= 8) //while condition
                .forEach(System.out::println);

        System.out.println("*************************************");

        list.stream()
                //drops number until condidtion
                .dropWhile(n -> n <= 8)
                .forEach(System.out::println);
    }

}
