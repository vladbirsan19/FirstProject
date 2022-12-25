package week13.funtionalinterfaces.example5;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Example5 {
    //UNARY OPERATOR +BINARY OPERATOR
    public static void main(String[] args) {
        //more specific Function
        //same return type as the parameter
        //UnaryOperator

        UnaryOperator<Integer> u1 = n -> n + 1;
        int res = u1.apply(10);
        System.out.println(res);

        UnaryOperator<String> u2 = str -> new StringBuilder(str)
                .reverse().toString();
        System.out.println(u2.apply("XYZ"));

        //BinaryOperator
        BinaryOperator<Integer> b1 = (n1, n2) -> n1 + n2;
        System.out.println(b1.apply(10, 20));

        BinaryOperator<String> b2 = (str1, str2) -> str1 + str2;
        System.out.println(b2.apply("ABCD", "XYZ"));
    }
}
