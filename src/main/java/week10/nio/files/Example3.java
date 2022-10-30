package week10.nio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example3 {
    // Copying a file

    public static void main(String[] args) {
        String fileName1 = "src/main/java/week10/nio/files/Example1.txt";
        Path p1 = Paths.get(fileName1);

        String fileName2 = "src/main/java/weel10/nio/files/Example3-copy.txt";
        Path p2 = Paths.get(fileName2);

        try{
            Files.copy( p1, p2); //Copy-paste
            // Files.move(p1, p2); //cut-paste
        }catch (IOException e){
            throw  new RuntimeException(e);
        }
    }
}
