package week5.sorted.comparator;

import java.util.Comparator;

public class PersonComparatorByAge implements Comparator {


    // compares object by age
    @Override
    public int compare(Object o1, Object o2) {
        return ((Person) o1).getAge() - ((Person) o2).getAge();
    }
}