public class Vehicle {
    private String vehicleName;
    private int engineCC;
    private String model;

    public Vehicle(String vehicleName, int engineCC, String model) {
        this.vehicleName = vehicleName;
        this.engineCC = engineCC;
        this.model = model;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public String getModel() {
        return model;
    }

    public void display() {
        System.out.println("Vehicle: " + vehicleName + ", Engine CC: " + engineCC + ", Model: " + model);
    }
}
