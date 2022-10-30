package week10.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example4 {

    // try catch finally
    //inLining
    public static void main(String[] args) {

        // wrapping low level streams with high level streams
        // inLine from Example3
        // var is Java syntax to replace object type

        var in = new BufferedReader(new InputStreamReader(System.in));

        // streams are RESOURCES (open , use , close )
        //before java 1.8 - > UGLY

        try {
            System.out.println("Enter your line");
            String line = in.readLine();

            System.out.println("LINE" + line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
