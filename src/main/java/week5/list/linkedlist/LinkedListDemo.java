package week5.list.linkedlist;

import week5.array.Student;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    // LinkedList is an ordered collection
    // it maintains the order of insertion
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(new Student("George"));
        list.add(new Student("Maria"));
        list.add(new Student("Vlad"));

        // examples of other methods that are present on LinkedList and not on ArrayList
//            list.addFirst();
//            list.addLast();

        // iterates through the list and prints all messages
        // in the order of insertion
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("--------------------------------------");

        //iterates through the list in DESCENDING order and prints all the messages
        Iterator iterator = list.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
