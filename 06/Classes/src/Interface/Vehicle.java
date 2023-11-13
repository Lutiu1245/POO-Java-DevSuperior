package Interface;

public class Vehicle {
    private String model;
    private CarRental carRental;

    public Vehicle(String model) {
        this.model = model;
    }

    public Vehicle(String model, CarRental carRental) {
        this.model = model;
        this.carRental = carRental;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
