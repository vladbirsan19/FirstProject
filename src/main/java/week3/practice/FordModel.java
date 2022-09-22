package week3.practice;

public class FordModel {
    private String model;
    private String fuelType;
    private int engineCapacity;

    public FordModel(String model, String fuelType, int engineCapacity) {
        this.model = model;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;

    }

    public String getModel() {
        return model;

    }

    public String getFuelType() {
        return fuelType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setModel(String model) {
        this.model = model;

    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;

    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

}
