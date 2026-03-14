public class Truck extends Vehicle{
    
        
    public Truck(int id,String brand,double speed, String fueltype){
        super(id, brand, speed, fueltype);
    }

    public void loadCargo(int weight){
        System.out.println("Loaded "+weight+"kgs worth of cargo.");
    }
    public void unloadCargo(){
        System.out.println("Unloaded all cargo.");
    }
}
