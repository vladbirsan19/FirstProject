package week10.nio.files.vowels;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example2NewWay {

    private static final String vowels = " aeiouAEIOU";

    public static void main(String[] args) {
        String fileName = "src/main/java/week10/nio/vowels/Example1-Vowel.txt";
        int counter = 0;
        try (var in = Files.newBufferedReader(Paths.get(fileName))) {
            String line;
            while ((line = in.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (vowels.contains(String.valueOf(String.valueOf(line.charAt(i))))) {
                        counter++;
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter);
    }

}
