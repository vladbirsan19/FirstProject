package week13.funtionalinterfaces.example3;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Example3 {

    //FUNCTION
    public static void main(String[] args) {
        //Function
        Function<String, Integer> f1 = (str) -> str.length();
        Integer res1 = f1.apply("Hi");
        System.out.println(res1);

        //BiFunction
        BiFunction<Integer, Integer, String> f2 = (n, n1) -> n + " " + n1;
        String res2 = f2.apply(10, 20);
        System.out.println(res2);
    }
}
