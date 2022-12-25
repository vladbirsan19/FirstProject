package week9.example1;

public class ExceptionDemo5 {
    public static void main(String[] args) {

        int firstNumber = 10;
        int secondNumber = 0;
        int result = 0;

        try {
            result = firstNumber / secondNumber;
            System.out.println(result);
        } catch (ArithmeticException exception) {
            System.out.println("Division by 0 is impossible");;
        }
    }
}
