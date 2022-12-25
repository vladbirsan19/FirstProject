package week13.lambda.example4;

import java.util.function.Function;

public class Example4 {
    public static void main(String[] args) {
        // x-> y encoding "ABCD" -> "BCDA"

        // YOU CAN ONLY WRITE YOUR OWN INTERFACE AS BEFORE

        Reverse r1 =(str) -> new StringBuilder(str).reverse().toString();
        System.out.println(r1.reverse("ABCD")); //BCDA

        // OR USE BUILT IN FUNCTIONAL INTERFACE
        // (Function)

        Function<String,String> f1 =(str) -> new StringBuilder(str).reverse().toString();
        System.out.println(f1.apply("ABCD"));
    }
}
