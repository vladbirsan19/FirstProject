package week10.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Example1 {
    // WRITING WITH FILES

    public static void main(String[] args) {
        String fileName = "src/main/java/week10/wiles/Example1.txt";

        try (Writer writer = new FileWriter(fileName);
             BufferedWriter out = new BufferedWriter(writer)) {
            out.write("My text from Example1 \n" +
                    "My text from Example1 \n" +
                    "My text from Example1 \n" +
                    "My text from Example1 \n" +
                    "My text from Example1 \n");
            System.out.println("File has been created successfully ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
