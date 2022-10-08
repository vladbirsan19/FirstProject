package week6.example1;

public class BasicGenericsDemo3 {

    public static void main(String[] args) {
        //FOCUS ON DECLARATION
        // left side is a constraint
        Person<Integer> p1;             // fixed type
        Person<?> p2;                   // any object wildcard

        /*
        Integer -> Number
        Double  -> Number
         */

        Person<? extends Number> p3;    // child of Number (Integer, Double)
        Person<? super Number> p4;      // superclass of Number (Object)


        // FOCUS ON INSTANTIATION
        // right side is effective type
        p1 = new Person<Integer>();
        p1 = new Person<>();
//        p1 = new Person<Double>(); compilation error

        // anything works - no restriction
        p2 = new Person<Integer>();
        p2 = new Person<String>();
        p2 = new Person<Double>();


        p3 = new Person<Number>();
        p3 = new Person<Integer>();
        p3 = new Person<Double>();
//        p3 = new Person<String>(); compilation error


        p4 = new Person<Number>();
        p4 = new Person<Object>();
//        p4 = new Person<Integer>(); compilation error


        // CONFUSION - 1
        // Person<Object> vs. Person<?>
        // first one allow ONLY a fixed type of OBJECT
        // second one allows anything

    }

}
