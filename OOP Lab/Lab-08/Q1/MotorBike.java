public class MotorBike extends Vehicle{
    
        
    public MotorBike(int id,String brand,double speed, String fueltype){
        super(id, brand, speed, fueltype);
    }

    public void popwheehlie(){
        System.out.println("Popping a wheelie");
    }
    public void enableABS(){
        System.out.println("Enabled ABS");
    }
}
