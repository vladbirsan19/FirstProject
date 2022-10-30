package week10.console;

public class Example1 {
    public static void main(String[] args) {
        System.out.println(":)"); //IO stream

        // .out is High-Level stream -PrintStream
        // if .out was a Low-level stream then we would've
        // had to convert ":)" into bytes -> String.getBytes();
        // PrintStream does this automatically for us
    }
}
