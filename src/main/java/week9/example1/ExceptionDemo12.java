package week9.example1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo12 {
    // classes that do not implement AutoClosable (even via inheritance)
    // cannot be used with try with resources

    public static void main(String[] args) {
        m1();
    }

    private static void m1() {
        //try with resources
        try (BufferedReader reader1 = new BufferedReader(new FileReader("text.txt"))) {
            // do something with the file
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // finally block is implicit and the resource will be closed

        // try with resources with custom resource that implements AutoClosabale interface
        // in order to be used in try with resources
        try (MyCustomResource resource = new MyCustomResource()) {

        } catch (FileNotFoundException e) {

        }
    }
}
