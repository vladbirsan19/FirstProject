package week13.streams.example5;

import java.util.List;

public class Example5a {

    public static void main(String[] args) {
        List<List<Integer>> listOfLists =List.of(
                List.of(1,2,3,4,5),
                List.of(4,5,6),
                List.of(1,3));

        var sum = listOfLists.stream() // List<Integer> [1, 2, 3, 4, 5], [4, 5, 6], [1, 3]
                .flatMapToInt(intList -> intList.stream() // Integers  1, 2, 3, 4, 5, 4, 5, 6, 1, 3
                        .mapToInt(Integer::intValue))
                .sum();
        System.out.println(sum);
    }
}
