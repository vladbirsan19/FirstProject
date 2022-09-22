package practice;

import java.util.Scanner;

public class CalculatorFromConsolePractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");

        int firstNumber = scanner.nextInt();

        System.out.println("Enter the wanted operation to be executed");

        char operation = scanner.next().toCharArray()[0];
        System.out.println("Enter second number:");

        int secondNumber = scanner.nextInt();

//        switch (operation) {
//            case '+':
//                System.out.println("Sum is :" + (firstNumber + secondNumber));
//                break;
//            case '-':
//                System.out.println("Difference is :" + (firstNumber - secondNumber));
//                break;
//            case '*':
//                System.out.println("Multiplier is :" + (firstNumber * secondNumber));
//                break;
//            case'/':
//                System.out.println("Division is :" + (firstNumber / secondNumber));
//                break;
//            case'%':
//                System.out.println("Modulo is:"+  (firstNumber% secondNumber));
//                break;
//            default:
//                System.out.println("Error, unknown operation");
        //enchanted "switch"
        switch (operation) {
            case '+' -> System.out.println("Sum is" + (firstNumber + secondNumber));
            case '-' -> System.out.println("Difference" + (firstNumber - secondNumber));
            case '*' -> System.out.println("Multiplier is:" + (firstNumber * secondNumber));
            case '/' -> System.out.println("Division is: " + (firstNumber / secondNumber));
            default -> System.out.println("Unknown operation");

        }

    }

}
