package week10.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example3 {
    // READING FROM FILES

    public static void main(String[] args) {
        String fileName = "src/main/java/week10/files/Example1.txt";
        try(var in = new BufferedReader(new FileReader(fileName))){

            String line;
            while((line= in.readLine()) !=null){
                System.out.println(line);

            }
        } catch (IOException e ){
            throw new RuntimeException(e);
        }
    }
}
