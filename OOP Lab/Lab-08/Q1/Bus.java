public class Bus extends Vehicle{
    
        
    public Bus(int id,String brand,double speed, String fueltype){
        super(id, brand, speed, fueltype);
    }

    public void pickPassengers(int count){
        System.out.println("Picked "+count+" passengers");
    }

    public void dropPassengers(){
        System.out.println("Dropped Passengers");
    }
}
