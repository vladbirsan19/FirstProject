package week9.example1;

public class ExceptionDemo8 {

    public static void main(String[] args) {

        try {
            System.out.println("a");
            throw new RuntimeException();
        } catch (RuntimeException exception) {
            System.out.println("b");
        } finally { // - gets executed if method is successful or exception is thrown
            System.out.println("c");
        }


        // catch blocks inverted will not work because RuntimeException is an Exception
        // and the 2nd catch block will never execute

        try {
            System.out.println("a");
            throw new RuntimeException();
        } catch (RuntimeException exception) {
            System.out.println("b");
        } catch (Exception exception) {
            System.out.println("b");
        } finally { // - gets executed if method is successful or exception is thrown
            System.out.println("c");
        }

        // bellow example will not compile because it makes no sense
        // to declare child and parent exceptions
        // they will anyway be handled together
//        try {
//
//        } catch (RuntimeException | InputMismatchException e) {
//            System.out.println("Message that applies to both exceptions");
//        }

    }
}
