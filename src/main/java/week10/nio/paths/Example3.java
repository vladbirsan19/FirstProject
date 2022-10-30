package week10.nio.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example3 {

    //NORMALIZATION
    public static void main(String[] args) {
        // ./ -> current directory
        // ../ -> one directory before

        Path p1 = Paths.get("a/b/c/./././d/../../c");
        /**
         * a/b/c/./././d/../../c -> not normalized
         * a/b/c/d/../../c       -> partially normalized
         * a/b/c
         */

        System.out.println(p1.normalize());


    }
}
