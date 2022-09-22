package week3.composition;

public class    Car {
    // fields are static only to keep it simple
    // they can also be defined as non-static (instance variables)

    public static Engine engine = new Engine(); // implicit constructor is used
    public static Seat seat = new Seat(); // implicit constructor is used

    public static void main(String[] args) {
        engine.startEngine(); // uses instance from Engine Class

        seat.setSeatColor("black");
        System.out.println(seat.getSeatColor()); // prints seat color
    }
}
