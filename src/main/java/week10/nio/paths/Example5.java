package week10.nio.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example5 {

    //Relativize

    public static void main(String[] args) {

        Path p1 = Paths.get ("b/c/d");
        Path p2 = Paths.get("b/q/w");
        /**
         * cd ../../q/w
         */

        //how to get from p1 to p2

        Path relativize = p1.relativize(p2);

        System.out.println(relativize);

    }
}
