public class Vehicle {

    private int speed;
    private String color;
    private int NoOfWheels;

    public Vehicle(){

    }

    public Vehicle(int speed, String color, int noofwheels){
        this.speed = speed;
        this.color = color;
        this.NoOfWheels = noofwheels;
    }

    public void setSpeed(int sp){
        this.speed = sp;
    }

    public void setColor(String c){
        this.color = c;
    }

    public void setWheels(int noofwheels){
        this.NoOfWheels = noofwheels;
    }

    public int getSpeed(){
        return this.speed;
    }
    public String getColor(){
        return this.color;
    }

    public int getWheels(){
        return this.NoOfWheels;
    }


    public void displayVehicle(){
        System.out.println("\nVehicle Speed: "+this.speed+
            "\nVehicle Color: "+this.color+
            "\nVehicle Wheels: "+this.NoOfWheels
        );
    }
}