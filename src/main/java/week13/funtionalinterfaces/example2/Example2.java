package week13.funtionalinterfaces.example2;

import java.util.Random;
import java.util.function.Supplier;

public class Example2 {
    //SUPPLIER
    public static void main(String[] args) {

        Supplier<Integer> s1= ()-> new Random().nextInt(1000);
        Integer integer =s1.get();
        System.out.println(integer);
    }
}
