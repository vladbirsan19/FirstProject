package week6.example10;

import java.util.ArrayList;
import java.util.List;

public class MainTheSolution {

    //THE SOLUTION

    public static void main(String[] args) {
        List<Person>list =new ArrayList<>();

        list.add(new Person());
        list.add(new Person());
        //because of generics
        //this doesn't compile anymore
        //see example0 -the problem
        //list.add(new Animal());

        for (Person p : list){
            p.doSomething();
        }
    }
}
