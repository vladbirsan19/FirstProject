package week4.interfaces;

public interface Animal  extends LivingBeing{

    // even if it's not mentioned
    // the access modifier is PUBLIC
    void eat();

    // even if it's not mentioned
    // abstract keyword is "always" present
    // in an interface < java 7
    public abstract void sleep();
}
