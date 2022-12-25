package week14.enums.example4;

public class Example4 {
    public static void main(String[] args) {
        for (Coffee c : Coffee.values()) { //array of Coffee[]
            System.out.println(c.name());
        }
    }
}
