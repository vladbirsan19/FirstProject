package week5.sorted.comparable;

import java.util.Set;
import java.util.TreeSet;

public class ComparableSetDemo {


    public static void main(String[] args) {

        // with Comparable, only one condition for comparison is allowed

        Set treeSet = new TreeSet();

        treeSet.add(new PersonForTreeSetComparable("Vlad", 30));
        treeSet.add(new PersonForTreeSetComparable("Andrei", 20));
        treeSet.add(new PersonForTreeSetComparable("Maria", 60));
        treeSet.add(new PersonForTreeSetComparable("Marius", 15));

        for (Object o : treeSet) {
            System.out.println(o);
        }
    }
}
