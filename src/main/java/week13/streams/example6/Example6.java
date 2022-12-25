package week13.streams.example6;

import java.util.List;

// .distinct() +sorted()
public class Example6 {
    public static void main(String[] args) {

        List<Integer>list = List.of (3,5,2,5,2,7,8,1);
        list.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("**************************************");

        list.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
