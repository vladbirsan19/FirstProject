package week6.example2;

public class GenericsDemo2 {

    public static void main(String[] args) {
        A<Integer>a1=new A<>();
        A<String>a2=new A<>();


        // just a shortcut
        //java can determine that the effective type can only be a Double

        A<Double>a3= new A<>();
    }
}
