package week6.example4;

public class GenericsDemo4 {

    public static void main(String[] args) {

        C<Integer> c1 = new C<>();
        C<Double> c2 =new C<>();
        C<Number> c3 = new C<>();

        // C<String> c3 = new c<>(); ->compilation error
    }
}
