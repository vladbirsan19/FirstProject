package week6.example9;

public class A {

    void m1() {

    }

    // T is only available in this method

    <T> T m2(T t) { return t;}

    static <T> T m3(T t) { return  t;}

    static <T> void doSomething (T t, Class <T> c) {
        // does something
    }
    static<T> T getBean (T parameter, Class<T> c) {return parameter;}
}
