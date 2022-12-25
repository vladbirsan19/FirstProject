package week9.example1;

public class ExceptionDemo11 {
    public static void main(String[] args) {

        // custom checked exception
        try {
            throw new MyCustomCheckedException();
        } catch (Exception e) {
            // DO NOT EVER CATCH EXCEPTION WITHOUT A GOOD REASON
            // DO NOT LEAVE EMPTY CATCH
        }

        // custom runtime exception
        throw new MyCustomRuntimeException("this is my custom exception");
    }
}
