package practice;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        String a, b = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter thr string you want to check:");
        a = scanner.nextLine();
        int n = a.length();
        for (int i = n - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }
        if (a.equalsIgnoreCase(b)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("the string is not a palindrome");

        }
    }

}
