package week9.example1;

import java.util.Scanner;

public class ExceptionDemo7 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int result = 0;

            try {
                int firstNumber = Integer.parseInt(scanner.next());
                int secondNumber = Integer.parseInt(scanner.next());

                result = firstNumber / secondNumber;
                System.out.println(result);
            } catch (ArithmeticException | NumberFormatException exception) {
                System.out.println("Error occurred. Please try again");
            }
        }
}
