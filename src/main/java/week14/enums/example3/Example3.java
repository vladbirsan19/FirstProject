package week14.enums.example3;

public class Example3 {
    public static void main(String[] args) {

        int s = Coffee.SMALL.ordinal();
        int m = Coffee.MEDIUM.ordinal();
        int l = Coffee.LARGE.ordinal();

        System.out.println(s);
        System.out.println(m);
        System.out.println(l);
        System.out.println("************************************");
        String sName = Coffee.SMALL.name();
        System.out.println(sName + " " + s);
    }
}
