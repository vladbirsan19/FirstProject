package week8;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Sum " + calculator.add(5, 10));
        System.out.println("Subtract " + calculator.subtract(20, 5));
        System.out.println("Multiply " + calculator.multiply(50, 300));
        System.out.println("Division " + calculator.divide(10, 3));
    }
}
