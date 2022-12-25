package week9.example1;

import java.util.Scanner;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;

        try {
            int firstNumber = Integer.parseInt(scanner.next());
            int secondNumber = Integer.parseInt(scanner.next());

            result = firstNumber / secondNumber;
            System.out.println(result);
        } catch (ArithmeticException exception) {
            System.out.println("Division by 0 is impossible");
        } catch (NumberFormatException exception) {
            System.out.println("Input was not valid");
        }
    }
}
