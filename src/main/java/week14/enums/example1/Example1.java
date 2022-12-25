package week14.enums.example1;

public class Example1 {
    public static void main(String[] args) {
        // Coffee small1 =new Coffee(); - not possible, constructor is private

        Coffee small =Coffee.SMALL;

        small.setQuantity(10);
        //a lot of other code
        System.out.println(small.getQuantity());
    }
}
