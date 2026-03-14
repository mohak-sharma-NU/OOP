public class Car extends Vehicle{
    
    public Car(int id,String brand,double speed, String fueltype){
        super(id, brand, speed, fueltype);
    }

    public void openSunroof(){
        System.out.println("Opening Car's Sunroof");
    }

    public void activateCruiseControl(){
        System.out.println("Cruise Control Activated");
    }
}