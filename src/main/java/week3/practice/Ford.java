package week3.practice;

public class Ford {
    public static void main(String[] args) {

        FordModel fordModel = new FordModel("Focus", "Gasoline", 1500);

        System.out.println("My model is: " + fordModel.getModel());
        System.out.println("The fuel type is: " + fordModel.getFuelType());
        System.out.println("The engine capacity is: " + fordModel.getEngineCapacity());
    }
}
