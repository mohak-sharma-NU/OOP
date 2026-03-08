public class Car extends MotorVehicle{
    private int NoOfDoors;

    public Car(int sp,String color,int wheelz,String lplate,int doorz){
        
        super(sp, color, wheelz, lplate);
        this.NoOfDoors = doorz;

    }

    public void setDoors(int no){this.NoOfDoors = no;}

    public int getNoOfDoors(){return this.NoOfDoors;}

    public void displayCar(){
        displayMotorVehicle();
        System.out.println("\nCar Number of Doors: "+this.NoOfDoors);
    }

    public static void main(String[] args) {
        

        Car c = new Car(70,"Sunburst Orange",4,"A55HOL",4);

        c.displayCar();
    }
}
