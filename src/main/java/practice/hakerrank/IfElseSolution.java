package practice.hakerrank;

import java.util.Scanner;

public class IfElseSolution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[u2028\u2029\u0085])?");
        if (N % 2 != 0) {
            System.out.println("weird");
        } else if (N >= 2 && N <= 5) {
            System.out.println("Not weird");

        } else if (N >= 6 && N <= 20) {
            System.out.println("weird");
        } else if (N >= 20) {
            System.out.println("Not weird");
        }
        scanner.close();
    }
}
