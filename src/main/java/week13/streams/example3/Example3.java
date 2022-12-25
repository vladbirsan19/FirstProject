package week13.streams.example3;

import java.util.List;

// .anyMatch(), .allMatch(), .noneMatch()
public class Example3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 5, 6, 3, 8, 9);

        boolean b1 = list.stream().anyMatch(n -> n % 2 == 0);
        boolean b2 = list.stream().allMatch(n -> n % 2 == 0);
        boolean b3 = list.stream().noneMatch(n -> n % 2 == 0);

        System.out.println(b1); //true
        System.out.println(b2); //false
        System.out.println(b3); //false

    }


}
