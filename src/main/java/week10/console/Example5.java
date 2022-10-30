package week10.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example5 {
    // try (catch) with resources

    public static void main(String[] args) {

        // streams are resources (open , use , close )
        // after java 1.8 -> PRETTY

        try (var in = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter your line");
            String line = in.readLine();

            System.out.println("Line" + line);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
