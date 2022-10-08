package week6.example9;

public class GenericsExample9 {
    public static void main(String[] args) {
        A.doSomething(10, Integer.class);

        String myBean = A.getBean("i", String.class);

    }
}
