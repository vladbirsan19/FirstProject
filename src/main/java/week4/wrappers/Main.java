package week4.wrappers;

public class Main {

    public static void main(String[] args) {

        //primitive
        //if not instantiated will be 0
        int i1 = 5;
//        i1. -> does not inherit anything from anyone (including object)

        //reference type
        //wrapper class
        //if not instantiated will be NULL
        Integer i2 = 5;
        double d = i2.doubleValue();
        System.out.println(d); // prints 5.0

    }
}
