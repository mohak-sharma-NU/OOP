



public class Vehicle {

    private User CurrentUser;
    private Engine engine;
    private static int vehicleID=0;
    private String Brand;
    private String Model;
    private int Year;
    private double engineCapacity;
    private String fuelType;

    //----CONSTRUCTORS---

    public Vehicle(){}

    public Vehicle(String Brand, String Model,int Year, double engineCapacity,String fuelType,Engine engine,User CurrUser){
        Vehicle.vehicleID++;
        this.Brand = Brand;
        this.Model = Model;
        this.Year = Year;
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.engine = engine;
        this.CurrentUser = CurrUser;
    }

    public Vehicle(Vehicle v){
        Vehicle.vehicleID++;
        this.Brand = v.Brand;
        this.Model = v.Model;
        this.Year = v.Year;
        this.engineCapacity = v.engineCapacity;
        this.fuelType = v.fuelType;  
        this.engine = v.engine;
    }

    //---SETTERS---

    public void set_VehicleID(int vehicleID){
        this.vehicleID = vehicleID;
    }
    public void set_VehicleBrand(String Brand){
        this.Brand = Brand;
    }
    public void set_VehicleModel(String Model){
        this.Model = Model;
    }
    public void set_VehicleYear(int Year){
        this.Year = Year;
    }
    public void set_VehicleEngineCapacity(double EngineCapacity){
        this.engineCapacity = EngineCapacity;
    }
    public void set_VehicleFuelType(String fueltype){
        this.fuelType = fueltype;
    }

    //---GETTERS---

    public int getVehicleID(){
        return this.vehicleID;
    }
    public String getVehicleBrand(){
        return this.Brand;
    }
    public String getVehicleModel(){
        return this.Model;
    }
    public int getVehicleYear(){
        return this.Year;
    }
    public double getVehicleEngineCapacity(){
        return this.engineCapacity;
    }
    public String getVehicleFuelType(){
        return this.fuelType;
    }

    //---CLASS METHODS---

    public double CalculateDeprecation(int price, int rateOfDeprecation, float timepassed){
        return price - (timepassed*rateOfDeprecation);
    }

    public void displaySpecs(){
        System.out.println("Vehicle ID: "+this.vehicleID+
        "\tVehicle Brand: "+this.Brand+
        "\tVehicle Model: "+this.Model+
        "\tVehicle Year: "+this.Year+
        "\tVehicle Engine Capacity: "+this.engineCapacity+
        "\tVehicle FuelType: "+this.fuelType);

        this.engine.displayEngineSpecs();
    }

    public boolean isVintage(int Year){
        return Year<1975;
    }

    // public boolean matchesBasicFilter(){
    //     return  ;
    // }

    public static void main(String[] args) {
        
    }
}