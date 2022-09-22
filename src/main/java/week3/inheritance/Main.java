package week3.inheritance;

public class Main {
    public static void main(String[] args) {

        //Animal is "parent" Class
        //Doesn't inherit any values from any other clas

        System.out.println("-----------Animal----------");
        Animal animal = new Animal();
        animal.eat();

        //Dog inherits (via extends keyword)
        //Behaviour from Animal Class

        System.out.println("----DOG----");
        Dog dog = new Dog();
        dog.bark();
        dog.eat();


        //Golden Retriever (child class) inherits (via extends keyword)
        //Behaviour from dog class and also from Animal class

        System.out.println("----GOLDEN RETRIEVER----");
        GoldenRetriever goldenRetriever = new GoldenRetriever();
        goldenRetriever.retrieve();
        goldenRetriever.bark();
        goldenRetriever.eat();
    }
}
