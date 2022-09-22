package week3.oop;

import week3.oop.Car;

public class MyCar {
    public static void main(String[] args) {

        Car myCar = new Car(" Black", "Gasoline", 1500);
        myCar.start();
        System.out.println("My car's color is: " + myCar.getColor());
        myCar.setColor(("Blue"));
        System.out.println("My car's color is: " + myCar.getColor());


    }
}
