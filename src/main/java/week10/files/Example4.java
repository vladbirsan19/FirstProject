package week10.files;

import java.io.IOException;
import java.io.PrintStream;

public class Example4 {

    //Alternative to writing in Files

    public static void main(String[] args) {
        String fileName = "src/main/java/week10/files/Example4.txt";
        try(PrintStream out =new PrintStream(fileName)){
            //remember System.out.println() ?

            out.println("My text from example 4");
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
