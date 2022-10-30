package week10.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Example3 {
    // parallel to Example2
    public static void main(String[] args) {
        // wrapping low level stream with high level streams
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader in = new BufferedReader(inputStreamReader);

        //IOException and FileNotFoundException -common CHECKED exceptions when working with IO

        try {
            System.out.println("Enter your line");
            String line = in.readLine(); // reads line from console

            System.out.println("LINE : " + line); // prints line to console
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
