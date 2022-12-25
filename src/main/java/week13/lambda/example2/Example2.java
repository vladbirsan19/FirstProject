package week13.lambda.example2;

public class Example2 {

    //FOCUS ON THE LEFT SIDE
    // n FROM NUMBER DOESN'T MATTER

    // FOCUS on the LEFT SIDE
    // n from number - doesn't matter
    X x1 = n -> System.out.println("Hi!"); // most used
    X x2 = (n) -> System.out.println("Hi!");
    X x3 = (int n) -> System.out.println("Hi!");
    X x4 = (var n) -> System.out.println("Hi!");


    // two parameters
    Y y1 = (a, b) -> System.out.println("Hi!"); // most used
    Y y2 = (int a, int b) -> System.out.println("Hi!");
    Y y3 = (var a, var b) -> System.out.println("Hi!");
}

