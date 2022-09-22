package week4.abstractclasses;

public abstract class Animal implements LivingBeing {
    public void eat() {
        System.out.println("Animal - eating");
    }

    @Override
    public void live(int age){
        System.out.println("Animal - living");
    }


    // classes that extend this class
    // must override/implement this method
    public abstract void sleep();
}
