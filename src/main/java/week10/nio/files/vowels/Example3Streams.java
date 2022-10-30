package week10.nio.files.vowels;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class Example3Streams {
    private static final String vowels= "aeiouAEIOU";

    public static void main(String[] args) {
        String fileName = "src/main/java/week10/nio/vowels/Example1-Vowel.txt";

        try (Stream<String> lines = Files.lines(Paths.get(fileName))) { // STREAM SOURCE
            //STREAMS-API
            var vowelCount = lines
                    .flatMap(line -> Arrays.stream(line.split(""))) // transform form line to character
                    .filter(vowels::contains)
                    .count();
            System.out.println(vowelCount);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}