package week13.streams.example4;

import java.util.List;

//.map()
public class Example4 {
    public static void main(String[] args) {
        List<String> list =List.of("abcd", "qwerty" ,"asdfg");

        var result =list.stream()/// "abcd", "qwerty", "asdfg"
                // changes one element to another
                // transforms input to output

                .map(s->s.length()) // 4, 6, 5
                // 0 + 4 = 4
                // 4 + 6 = 10
                // 10 + 5 = 15
                .reduce(0,(i1,i2) ->i1 +i2);
        System.out.println(result);

    }
}
