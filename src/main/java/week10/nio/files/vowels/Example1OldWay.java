package week10.nio.files.vowels;

import java.io.*;

public class Example1OldWay {

    private static final String vowels = " aeiouAEIOU";

    public static void main(String[] args) {
        String fileName = "src/main/java/week10/nio/vowels/Example1-Vowel.txt";
        int counter = 0;
        try (FileInputStream fis = new FileInputStream(fileName);
             Reader r = new InputStreamReader(fis);
             BufferedReader in = new BufferedReader(r)) {
            String line;

            while ((line = in.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (vowels.contains(String.valueOf(line.charAt(i)))) {
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
