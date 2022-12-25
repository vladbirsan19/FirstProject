package practice.basicexercises;

import java.util.Scanner;

public class AuthenticationMethod {
    public static void main(String[] args) {

        String username, password;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        username = scanner.nextLine();
        System.out.println("Enter password;");
        password = scanner.nextLine();

        if (username.equals("user") && password.equals("password")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed, username and/or password are invalid");
        }


    }
}
