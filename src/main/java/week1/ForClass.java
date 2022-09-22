package week1;

import java.util.List;

public class ForClass {


    public static void main(String[] args) {
        //standard for
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }
        // will be presented later
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        //enchanted for
        for(int i:list) {
            System.out.println("From enchanted for" + 1);
        }
    }

}
