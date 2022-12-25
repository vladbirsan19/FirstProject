package week13.streams.example6;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example6a {
    public static void main(String[] args) {
        List<Integer>list=List.of(3,5,2,5,2,7,8,1);
        Comparator<Integer> c = Collections.reverseOrder();

        list.stream()
                .distinct()
                .sorted(c)
                .forEach(System.out::println);
    }
}
