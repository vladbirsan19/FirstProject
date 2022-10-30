package week10.nio.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example2 {

    public static void main(String[] args) {
        //path types

        Path p1 = Paths.get("a/b/c/d"); //relative path
        Path p2 = Paths.get("/c/d"); //absolute path
        Path p3 = Paths.get("C:/a/b/c"); //windows absolute path


        //common methods

        System.out.println(p1.getFileName()); //d
        System.out.println(p1.getRoot()); // null
        System.out.println(p1.getParent());// a\b\c
        System.out.println("**************************");
        System.out.println(p2.getFileName());   // d
        System.out.println(p2.getRoot()); // \
        System.out.println(p2.getParent()); // \c
        System.out.println("**************************");
        System.out.println(p3.getFileName());  // c
        System.out.println(p3.getRoot());  // c:\
        System.out.println(p3.getParent()); // c:\a\b

    }
}
