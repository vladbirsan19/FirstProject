package week13.streams.example5;

import java.util.Arrays;
import java.util.List;

public class Example5b {
    public static void main(String[] args) {
        List<String> list = List.of("ab4n3kdk4", "n23n2nmn", " mk8t21", "012at");

        String digits = "0123456789";
        var count = list.stream() // "ab4n3kdk4", "n23n2nmn", " mk8t21", "012at"
                .flatMap(s -> Arrays.stream(s.split(""))) //"a","b","4",n,3,k,d,k,4,n,2,3...
                .filter(c -> digits.contains(c))
                .count();
        System.out.println(count);
    }
}
