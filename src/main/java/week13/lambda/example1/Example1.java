package week13.lambda.example1;

public class Example1 {
    public static void main(String[] args) {
        //Instrument i = new Piano(); -we don't have it

        //()->parameters of the method from Instrument Interface
        // ->lambda syntax
        // after "->" implementation of method
        Instrument i = ()-> System.out.println("Hi"); //shorter syntax
        i.play();

        //Functional interface
        //only one Abstract method is allowed!
        // you can use lambda only with Functional interfaces

        //From Java 8 you can have DEFAULT and STATIC implementations
        //in interfaces using -> default keyword

        //RECOMMENDATION
        // BE AWARE OF LIBRARIES OR FRAMEWORKS
        //THAT HAVE ONLY ONE ABSTRACT METHOD
        //BUT DO NOT HAVE THE @FunctionalInterface ANNOTATION
        //THEY MIGHT CHANGE IN FUTURE
        // AND YOUR CODE WILL NOT COMPILE ANYMORE
    }
}
