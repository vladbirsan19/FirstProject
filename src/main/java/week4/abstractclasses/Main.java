package week4.abstractclasses;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();

        // Animal a = new Animal(); does not work because Animal class is abstract
        // you can only instantiate with a child class
        // because they offer implementation for the abstract methods

        Animal a1 = new Cat();
        Animal a2 = new Dog();

        // LivingBeing lb = new LivingBeing();
        // you can only instantiate with a child class
        // because they offer implementation for the abstract methods

        // does not compile because Animal itselft cannot be instantiated
        // contains also abstract methods being an abstract class
        // LivingBeing lb1 = new Animal();
        LivingBeing lb2 = new Cat();
        LivingBeing lb3 = new Dog();


    }
}
