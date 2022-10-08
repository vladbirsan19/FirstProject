package week6.example0;

import java.util.ArrayList;
import java.util.List;

public class MainTheProblem {
    //THE PROBLEM
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add(new Animal());
        list.add(new Person());
        list.add(new Person());

        for (Object o : list) {
            if (o instanceof Person)
                ((Person) o).doSomething();
            else
                ((Animal) o).doNothing();
        }

    }
}
