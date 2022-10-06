package week5.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        Set set1 = new HashSet();

        set1.add(new PersonForSet("Vlad"));
        set1.add(new PersonForSet("Andrei"));

        // will not be added because SET only stores unique data
        // it does this by using .equals() and .hashcode() methods of the PersonForSet object
        // .hashcode() is checked first and then .equals() is consulted
        set1.add(new PersonForSet("Vlad"));
        set1.add(new PersonForSet("Vlad"));

        // iterating through a non-generic SET
        for (Object o : set1) {
            System.out.println(o);
        }

    }
}
