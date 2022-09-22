package week2;

public class StaticExample {
    public static int x = 10;

    public static int y;

    public StaticExample(int y) {
        this.y = y;
    }

    public static void main(String[] args) {
        m1();

        StaticExample staticExample1 = new StaticExample(5);
        staticExample1.m2();

        StaticExample staticExample2 = new StaticExample(50);
        staticExample2.m2();
    }

    public static void m1() {
        System.out.println(x);
    }

    public static void m2() {
        System.out.println(y);
    }
}
