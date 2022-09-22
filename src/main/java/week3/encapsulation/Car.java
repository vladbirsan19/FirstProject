package week3.encapsulation;

public class Car {

    private static int yearOfMake = 2000;

    private String model;

    private String engineType;

    public Car(String modelReceived){ this.model = modelReceived; }

    //Getter methods always follow the same name rule
    //getPropertyName

    public String getModel() { return model;}

    public void setModel ( String model) { this.model = model; }

    public String getEngineType() { return engineType ; }

    //Setter methods always follow the same naming rule
    // setPropertyName

    public void setEngineType(String engineTypeReceived) { this.engineType = engineTypeReceived ;}

}
