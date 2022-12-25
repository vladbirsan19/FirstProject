package week13.funtionalinterfaces.example4;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Example4 {

    //PREDICATE

    public static void main(String[] args) {
        // more specific  Function -always return boolean
        //Predicate
        Predicate<String> p1 = (str) -> str.length() == 5;
        boolean res1 = p1.test("Hello");
        System.out.println(res1);

        System.out.println(p1.test("XYZ"));

        //BiPredicate

        BiPredicate<String, Integer> p2 = (str, n) -> str.length() == n;
        boolean res2 =p2.test("Vlad", 20);
        System.out.println(res2);
        System.out.println(p2.test("hi",3));
    }
}
