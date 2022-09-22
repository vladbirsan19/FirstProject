package week2;

public class Recursion {

    //index
    //[0, 1, 2, 3, 4, 5]
    //values
    //[1, 1, 2, 3, 5, 8]

    public static void main(String[] args) {
        int fibonacciSum = fibonacci(5);

        System.out.println(fibonacciSum);

    }

    public static int fibonacci(int n) {
        System.out.println(n);
        if (n == 0 || n == 1) {
            return n;
        }

        int fibonacci = fibonacci(n - 1);
        int fibonacci1 = fibonacci(n - 2);

        return fibonacci + fibonacci1;

    }
}
