package week5.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemoWithCnp {
    public static void main(String[] args) {

        Set set = new HashSet();

        set.add(new PersonForSetWithCnp("Vlad", 1));
        set.add(new PersonForSetWithCnp("Andrei", 2));
        set.add(new PersonForSetWithCnp("Vlad", 3));

        // this will not be added in the SET because CNP 3 already exists
        set.add(new PersonForSetWithCnp("Marius", 3));

        for (Object o : set) {
            System.out.println(o);
        }
    }
}
