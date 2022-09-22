package practice;

import java.util.Scanner;

public class ReturnTypesPractice {
    public static void main(String[] args) {
        m3();

        int amount = m2();
        System.out.println("Amount is: " + amount);

    }

    public static void m1() {
        System.out.println("Sold is :");

    }

    public static int m2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First number:");
        int a = scanner.nextInt();
        System.out.println("Enter Second number:");
        int b = scanner.nextInt();
        int sum = a + b;
        return sum;
    }

    public static void m3() {
        System.out.println("Check your amount");
    }

}
