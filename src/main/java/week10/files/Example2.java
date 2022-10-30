package week10.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Example2 {
    // Writing with files
    // PAY ATTENTION TO .close() METHOD
    public static void main(String[] args) {
        String fileName = " src/main/javam/week10/files/Example2.txt";

        try{
            Writer writer = new FileWriter(fileName);
            BufferedWriter out =new BufferedWriter(writer);
            out.write("My text from Example 2");

            //out.flush(); // only saves data, but doesn't close the resource

            System.out.println("File has been created successfully ");

        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
