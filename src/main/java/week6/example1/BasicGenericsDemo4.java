package week6.example1;

public class BasicGenericsDemo4 {

    // LEGAL EXPRESSIONS
    public static void main(String[] args) {

        Person<Integer> p1 = new Person<Integer>();
        p1.x = 10;

        Person<Number> p2 = new Person<Number>();
        p2.x = 10;

        Person<? extends Number> p3 = new Person<Integer>();
//        p3.x = 10;  (integer)  -> compilation problem
//        p3.x = 10.0; (double)  -> compilation problem

        Person<? extends Number> p31 = new Person<Integer>(10);
        System.out.println(p31.x);

        Person<? super Number> p4 = new Person<Number>();
        p4.x = 10;
        p4.x = 10.0;

        Person<?> p5 = new Person<Number>();
//        p5.x = 10; -> compilation problem
        Person<?> p51 = new Person<Number>(10);


    }
}


