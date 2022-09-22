package week4.bokingunboxin;

public class Main {
    public static void main(String[] args) {
        Integer i1 = 5;

        //these are equivalent
        int i2 = i1; // shortcut - auto unboxing
        int i3 = i1.intValue(); // this is explicitly extracting the int value from Integer wrapper (box)

        int i4 = 5;
        Integer i5 = i4; // auto boxing
    }
}
