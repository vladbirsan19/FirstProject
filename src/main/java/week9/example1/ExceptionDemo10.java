package week9.example1;

import java.io.IOException;

public class ExceptionDemo10 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (IOException e) {
            // intentionally empty
        }
    }

    private static void m1() throws IOException {
        m2();
    }

    // with throws, we decide that the method will not handle by itself the exception
    // and will propagate it to the calling method
    private static void m2() throws IOException {
        throw new IOException();
    }
}
