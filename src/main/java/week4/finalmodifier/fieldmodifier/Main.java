package week4.finalmodifier.fieldmodifier;

public class Main {

    // this is a constant
    // constant name is always with capital letters -> PI, PI_FROM_MATH
    // static to be the same for all instances
    // final means that it does not change after it has been initialized
    public static final double PI = 3.14;

    public static void main(String[] args) {
        Person p = new Person("Vlad");
//        p.gender = 'F'; -> does not compile because gender if final
//        p.name = "Andrei"; -> does not compile because name is final
        p.setAge(20); // -> this is option, code works with/without it

        System.out.println(p);

    }
}
