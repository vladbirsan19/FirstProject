package week13.streams.example5;

import java.util.List;

//flatMap()->still a .mat()
public class Example5 {

    //.map() transforms something to something
    // .map() transforms x->y

    // .flatMap() transforms something to Stream
    // input is transformed and outputted to Stream
    // you don't process that element
    //BUT what's inside the element

    public static void main(String[] args) {

        List<List<Integer>> listOfLists = List.of(
                List.of(1, 2, 3, 4, 5),
                List.of(4, 5, 6),
                List.of(1, 3));
        Integer sum = listOfLists.stream()// List<Integer> [1, 2, 3, 4, 5], [4, 5, 6], [1, 3]
                .flatMap(integers -> integers.stream()) // Integers  1, 2, 3, 4, 5, 4, 5, 6, 1, 3
                .reduce(0, (i1, i2) -> i1 + i2);
        System.out.println(sum);

    }
}
