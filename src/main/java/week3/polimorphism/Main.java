package week3.polimorphism;

public class Main {
    public static void main(String[] args) {

        System.out.println("----Animal----");
        Animal animal = new Animal();
        System.out.println(animal.eat());
        System.out.println("--------");


        System.out.println("----Dog----");
        Dog dog = new Dog();
        System.out.println(dog.eat());
        dog.eat("meat");
        dog.sleep();
        System.out.println("--------");

        System.out.println("---Dog as Animal---");
        Animal dogAnimal = new Dog();
        System.out.println(dogAnimal.eat());
        System.out.println("---------");

        // based on the type of object
        // the correct move method will be called
        // at runtime
        Animal dogAnimal1 = new Dog();
        dogAnimal1.move(); //dynamic dispatch

        Animal animal1 = new Animal();
        animal1.move();

        // base on the type of the data types (Animal)
        // we can determine at compile time what methods
        // are available
//        dogAnimal1.sleep(); does not work

    }
}
