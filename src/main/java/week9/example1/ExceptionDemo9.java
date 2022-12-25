package week9.example1;

import java.io.IOException;

public class ExceptionDemo9 {
    public static void main(String[] args) {
//        m1();
        m1();
    }

    //checked exception
    public static void m1() {
        try {
            // some method that trows a checked exception or throwing directly
            throw new IOException("my forced exception");
            // by throwing this CHECKED exception compiler forces us to handle
            // the exception
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
