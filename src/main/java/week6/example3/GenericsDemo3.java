package week6.example3;

public class GenericsDemo3 {

    public static void main(String[] args) {
        //B<int> b0 = new B<int>();-> Compilation error

        B<?> b1 = new B<Object>();
        //b1.a = 10->compilation error
        //solution is to use constructor

        B<?> b21 = new B<Object>(10);

        B<?> b3 = new B<>(10);
        System.out.println(b3.a.getClass());

        B<?> b4 = new B<>(10.0);
        System.out.println(b4.a.getClass());

        B<? extends Number> b5 = new B<>(10);
        System.out.println(b5.a.getClass());

        B<?super Number> b6 = new B<>(10);

        System.out.println(b6.a.getClass());

    }
}
