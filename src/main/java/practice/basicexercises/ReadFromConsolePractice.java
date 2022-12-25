package practice.basicexercises;

import java.util.List;
import java.util.Scanner;

import static java.util.List.of;

public class ReadFromConsolePractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number");

        int number1 = scanner.nextInt();
        System.out.println("Enter your second number");

        int number2 = scanner.nextInt();

        int sum = number1 + number2;

        System.out.println("Result is: " + sum);

        List<Integer> list=List.of (10,20,30,40,50);

        for(int number:list){
            System.out.println("This is a lucky number"+list);
        }

    }
}