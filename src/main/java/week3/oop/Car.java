package week3.oop;

public class Car {
    private String color;
    private String fuelType;
    private int engineCapacity;

    public Car(String color, String fuelType, int engineCapacity) {
        this.color = color;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
    }

    public String getColor() {
        return color;
    }

    public String getFuelType() {
        return fuelType;

    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setColor(String color) {
        this.color = color;

    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;

    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void start() {
        System.out.println("Car started.");

    }
}
