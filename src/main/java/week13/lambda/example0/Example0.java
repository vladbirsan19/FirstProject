package week13.lambda.example0;

public class Example0 {

        public static void main(String[] args) {

            // TOO LONG
            Dog d1 = new Dog() {
                @Override
                public void eat() {
                    System.out.println("eating");
                }
            };

            Dog d2 = () -> System.out.println("eating");

        }
    }
