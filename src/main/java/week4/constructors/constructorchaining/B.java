package week4.constructors.constructorchaining;

public class B extends C {
    public B() {
        // implicit call to parent constructor
        super();
        System.out.println("inside B constructor");
    }
}
