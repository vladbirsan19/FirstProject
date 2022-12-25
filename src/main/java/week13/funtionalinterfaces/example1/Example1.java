package week13.funtionalinterfaces.example1;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Example1 {

    //CONSUMER
    public static void main(String[] args) {

        //Consumer
        Consumer<String> c1 = s -> System.out.println(s);
        c1.accept("Hi!");

        //BiConsumer
        BiConsumer<String, Integer> c2 = (s1, s2) -> System.out.println(s1 + " " + s2);
        c2.accept("Hello", 10);

        //seen before?
        List<Integer> list = List.of(10, 20 , 30 );
        Consumer<Integer> consumer = n -> System.out.println(n);
        list.forEach(consumer);

        Map<Integer , String> map = Map.of(10 , "A ," , 20 , "B" , 30 , "C");
        BiConsumer<Integer ,String> biConsumer = (k,v) -> System.out.println(k+ " " +v);
        map.forEach(biConsumer);





    }
}
