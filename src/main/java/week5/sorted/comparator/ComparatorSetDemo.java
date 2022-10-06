package week5.sorted.comparator;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorSetDemo {
    public static void main(String[] args) {

        // with Comparator, we can have multiple conditions on which we compare the objects

//        Set treeSet = new TreeSet(new PersonComparatorByAge());
        Set treeSet = new TreeSet(new PersonComparatorByName());

        treeSet.add(new Person("Vlad", 30));
        treeSet.add(new Person("Andrei", 20));
        treeSet.add(new Person("Maria", 60));
        treeSet.add(new Person("Marius", 15));


        for (Object o : treeSet) {
            System.out.println(o);
        }
    }
}
