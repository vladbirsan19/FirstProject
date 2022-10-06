package week5.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        // a Map has key-value pair
        Map map = new HashMap();

        map.put(1, new PersonForMap("Vlad"));
        map.put(2, new PersonForMap("Andrei"));

        // this overrides key 2 and replaces the value Andrei with Alex
        map.put(2, new PersonForMap("Alex"));


        // iterating through the keys
        for (Object o : map.keySet()) {
            System.out.println(o);
        }

        // iterating through the values
        for (Object o : map.values()) {
            System.out.println(o);
        }
    }
}
