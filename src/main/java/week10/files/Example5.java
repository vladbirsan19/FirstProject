package week10.files;

import java.io.IOException;
import java.io.PrintWriter;

public class Example5 {
    public static void main(String[] args) {
        String fileName= "src/main/java/week10/files/example5.txt";

        try (PrintWriter out =new PrintWriter(fileName)){

            out.println("My text from Example 5");
            // .flush() will be called automatically at .close()

        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
