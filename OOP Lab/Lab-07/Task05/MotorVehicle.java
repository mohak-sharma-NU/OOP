

public class MotorVehicle extends Vehicle {
    private String LicensePlate;

    public MotorVehicle(int sp,String color,int wheelz,String lplate){
        super(sp, color, wheelz);
        this.LicensePlate = lplate;
    }

    public void setLicensePlate(String l){
        this.LicensePlate = l;
    }
    public String getLicensePlate(){
        return this.LicensePlate;
    }

    public void displayMotorVehicle(){
        displayVehicle();
        System.out.println("\nMotor Vehicle License Plate: "+this.LicensePlate);
    }
}
