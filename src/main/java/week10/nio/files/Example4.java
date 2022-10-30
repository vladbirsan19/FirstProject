package week10.nio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Example4 {

    //Reading from a file
    public static void main(String[] args) throws IOException {
        String fileName= "src/main/jama/week10/nio/files/Example1.txt";

        Path p1= Paths.get(fileName);

        List<String> fileContent = Files.readAllLines(p1);
        //byte[] bytes =Files.readAllBytes(p1);

        for(String line : fileContent){
            System.out.println(line);
        }
        // BE VERY VERY VERY CAREFUL WHEN READING "DATA" FROM A FILE
        // REGARDLESS OF THE TYPE FILE - BUT ESPECIALLY FROM BINARY FILES
        // FROM EXTERNAL MEMORY (SSD) -> JAVA (RAM) MEMORY -> OUTOFMEMORYEXCEPTION
    }
}
