package practice;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        int a;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Grade to convert:");

        a = Integer.parseInt(scanner.nextLine());

        char grade;

        if (a >= 90) {
            grade = 'A';
        } else if (a >= 80) {
            grade = 'B';
        } else if (a >= 70) {
            grade = 'C';
        } else if (a >= 60) {
            grade = 'D';

        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
}
