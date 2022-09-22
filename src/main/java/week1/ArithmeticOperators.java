package week1;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum of a and b is: " + sum);

        int diff = b - a;
        System.out.println("Difference between a and b is: " + diff);

        int prod = a * b;
        System.out.println("Product od a and b is: " + prod);

        int div = b / a;
        System.out.println("Division of b and a is: " + div);

        int mod = b % a;
        System.out.println("Reminder of b and a is: " + mod);

        System.out.println("Postfix increment");
        System.out.println(a++);
        System.out.println("Postfix decrement");
        System.out.println(a--);
        System.out.println("Prefix decrement:");
        System.out.println(--a);
        System.out.println("Prefix increment:");
        System.out.println(++a);


    }
}

