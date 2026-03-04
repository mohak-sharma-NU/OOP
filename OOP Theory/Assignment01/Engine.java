public class Engine {

    private final String engineNumber;  

    private int horsepower;
    private int capacityCC;
    private String fuelType;
    private String transmissionType;
    private String condition;

    //   CONSTRUCTORS

    public Engine() {
        this.engineNumber = "UNKNOWN";
    }

    public Engine(String engineNumber, int horsepower, int capacityCC,String fuelType, String transmissionType, String condition) {
        this.engineNumber = engineNumber;
        this.horsepower = horsepower;
        this.capacityCC = capacityCC;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.condition = condition;
    }

    public Engine(Engine obj) {
        this.engineNumber = obj.engineNumber;
        this.horsepower = obj.horsepower;
        this.capacityCC = obj.capacityCC;
        this.fuelType = obj.fuelType;
        this.transmissionType = obj.transmissionType;
        this.condition = obj.condition;
    }

    //   SETTERS

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void setCapacityCC(int capacityCC) {
        this.capacityCC = capacityCC;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    //   GETTERS

    public String getEngineNumber() {
        return this.engineNumber;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    public int getCapacityCC() {
        return this.capacityCC;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public String getTransmissionType() {
        return this.transmissionType;
    }

    public String getCondition() {
        return this.condition;
    }

    //   CLASS METHODS

    public void startEngine() {
        if (!condition.equalsIgnoreCase("DAMAGED")) {
            System.out.println("Engine started successfully.");
        } else {
            System.out.println("Engine cannot start. It is damaged.");
        }
    }

    public void stopEngine() {
        System.out.println("Engine stopped.");
    }

    public double calculateFuelEfficiency() {
        if (capacityCC == 0) return 0;
        return (horsepower * 0.1) / capacityCC;
    }

    public void displayEngineSpecs() {
        System.out.println("\nEngine Number: " + this.getEngineNumber() +
        "\tEngine Horsepower: " + this.getHorsepower() +
        "\tEngine Capacity: " + this.getCapacityCC() +
        "\tEngine Fuel Type: " + this.getFuelType()+
        "\tEngine Transmission: " + this.getTransmissionType()+
        "\tEngine Condition: " + this.getCondition());
    }

    public static void main(String[] args) {
        
    }
}