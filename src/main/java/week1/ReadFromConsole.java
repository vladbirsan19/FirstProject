package week1;

import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number");


        int i = sc.nextInt();
        System.out.println("Enter your second number");

        int i1 = sc.nextInt();

        int sum = i + i1;

        System.out.println("Result is : " + sum);


    }
}
