package week13.streams.example4;


import java.util.List;

//mapToInt
public class Example4a {
    public static void main(String[] args) {
        List<String> list=List.of("abcd" , "qwerty" ,"asdfg");

        int sum = list.stream()
                .mapToInt(String::length) // 4,6,5
                .sum();
        System.out.println(sum);

        // Stream (abstract)
        // .map()         Stream -> Stream
        // .mapToInt()    Stream -> IntStream
        // .mapToLong()   Stream -> LongStream
        // .mapToDouble() Stream -> DoubleStream

        // IntStream (primitive stream)
        // .map()         IntStream -> IntStream
        // .mapToLong()   IntStream -> LongStream
        // .mapToDouble   IntStream -> DoubleStream
        // .mapToObject   IntStream -> Stream
    }
}
