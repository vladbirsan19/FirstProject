package week10.nio.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example2 {
    //DELETE
    public static void main(String[] args) throws IOException {
        String fileName = " src/main/java/week10/nio/files/Example1.txt";
        Path p1 = Paths.get(fileName);

        //Files.delete(p1);

        boolean result = Files.deleteIfExists(p1);

        System.out.println(result);

    }
}
