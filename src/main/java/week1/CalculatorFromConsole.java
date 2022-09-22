package week1;

import java.util.Scanner;

public class CalculatorFromConsole {
    public static void main(String[] args) {

        //object to read input from console
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");

        //make sure you use relevant names for variables
        int firstNumber = sc.nextInt();

        System.out.println("Enter the wanted operation to be executed");

        char operation = sc.next().toCharArray()[0];

        // String operation = sc.next(); (can be used to replace char)

        System.out.println("Enter second number");
        int secondNumber = sc.nextInt();

        switch (operation) {
            case '+' -> System.out.println("Sum is" + (firstNumber + secondNumber));
            case '-' -> System.out.println("Difference" + (firstNumber - secondNumber));
            case '*' -> System.out.println("Multiplier is:" + (firstNumber * secondNumber));
            case '/' -> System.out.println("Division is: " + (firstNumber / secondNumber));
            default -> System.out.println("Unknown operation");
        }


    }
}
