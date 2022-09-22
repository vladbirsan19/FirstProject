package week4.constructors.constructorchaining;

public class A extends B {


        public A() {
            // implicit call to parent constructor
            super();
            System.out.println("inside A constructor");
        }
}
