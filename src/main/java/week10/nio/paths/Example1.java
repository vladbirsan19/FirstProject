package week10.nio.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example1 {

    //NIO is a better alternative to IO

    public static void main(String[] args) {
        //using Path interface we are able to ignore the specific implementation of the path
        //WindowsPath & UnixPath
        Path p1= Paths.get("a/b/c");
        //widows -C:\
        //linux src/main

        System.out.println(p1);
        System.out.println(p1.getClass());

        Path p2= Paths.get("a", "b" ,"c");
        System.out.println(p2);

    }
}
