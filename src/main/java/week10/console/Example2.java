package week10.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Example2 {

    //parallel to Example 1
    // wrapping low level stream with high level streams

    public static void main(String[] args) throws IOException {
        //InputStream in = System.in.read();
        //.in is a low level stream ->InputStream-reads bytes

        Scanner scanner = new Scanner(System.in);
        // util class
        //this is what we used until now - but not in the scope of IO


        //wrapping low level stream with high level streams

        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream); // wants an InputStream
        BufferedReader in = new BufferedReader(inputStreamReader); // wants a Reader

        //Reader is telling the stream how it should READ
        //InputStreamReader(reads series of bytes ) and FileReader(reads from text files - char by char)

        System.out.println("Enter your line");
        String line =in.readLine(); //reads the line from console

        System.out.println("Line " + line); // prints line to console
    }
}
