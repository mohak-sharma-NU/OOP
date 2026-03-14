public class Vehicle {
    private int VehicleID;
    private String Brand;
    private double Speed;
    private String FuelType;

    public Vehicle(){

    }

    public Vehicle(int id,String brand,double speed, String fueltype){
        this.VehicleID = id;
        this.Brand = brand;
        this.Speed = speed;
        this.FuelType = fueltype;
    }

    // Setters
    public void setVehicleID(int VehicleID){
        this.VehicleID = VehicleID;
    }

    public void setBrand(String Brand){
        this.Brand = Brand;
    }

    public void setSpeed(double Speed){
        this.Speed = Speed;
    }

    public void setFuelType(String FuelType){
        this.FuelType = FuelType;
    }

    // Getters
    public int getVehicleID(){ 
        return this.VehicleID;
    }

    public String getBrand(){
        return this.Brand;
    }

    public double getSpeed(){
        return this.Speed;
    }

    public String getFuelType(){
        return this.FuelType;
    }

    //class methods

    public void startVehicle(){
        System.out.println("Starting Vehicle.");
    }

    public void stopVehicle(){
        System.out.println("Stopping Vehicle.");
    }

    public void printVehicleInfo(){
        System.out.println("vehicle ID: "+this.VehicleID
        +"\nVehicle Brand: "+this.Brand
        +"\nVehicle Speed: "+this.Speed
        +"\nVehicle Fuel Type: "+this.FuelType);
    }
}
