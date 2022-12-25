package week9.example2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingDemo {
    public static Logger logger = Logger.getLogger("week9.example2.LoggingDemo1");

    public static void main(String[] args) {
        m1();
        m2();
    }

    private static void m1() {
        System.out.println("Inside method m1");
    }

    private static void m2() {
        logger.info("Inside method m2");
        logger.severe("Inside method m2");
        logger.log(Level.WARNING, "Inside method m2");
    }
}
