package week5.list.arraylist;

import week5.list.Hired;
import week5.list.Student;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    // ArrayList is an ordered collection
    // it maintains the order of insertion
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add(new Hired("Vlad"));
        list.add(new Student("Andrei"));

        // iterates through the list and prints all messages
        // in the order of insertion
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-----------------------");

        // remove method makes use of .equals() method behind
        // to find the actual item that needs to be removed
        // look at Hired class to see that the .equals() methods has been overridden
        // so that it checks if the objects are equal by the name property
        list.remove(new Hired("Vlad"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}