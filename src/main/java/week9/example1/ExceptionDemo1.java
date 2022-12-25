package week9.example1;

import java.util.Scanner;

public class ExceptionDemo1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers");

        int result = divideNumbers(scanner.nextInt(), scanner.nextInt());

//        int result = divideNumbers(10, 5);

        System.out.println(result);
    }

    public static int divideNumbers(int a, int b) {
        return a / b;
    }
}
