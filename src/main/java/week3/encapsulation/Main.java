package week3.encapsulation;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car ("Ford");

        Car c2 =new Car ("Audi");

        Car c3= new Car("Volkswagen");
        c3.setEngineType("VR6");

        // making model property private in Car Class
        // this class cannot simply change the value
        // as used in previous example
        // c1.model -> does not compile

        //we use getter methods to obtain the property values

        System.out.println(c1.getModel());

        System.out.println(c3.getEngineType());
    }
}
