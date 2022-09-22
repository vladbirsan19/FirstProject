package week4.finalmodifier.methodmodifier;

public class A extends B {
    @Override
    public void doSomething() {

    }

    // this does not compile because .doSomethingElse()
    // in class B is marked as final
//    @Override
//    public void doSomethingElse(){
//
//    }
}
