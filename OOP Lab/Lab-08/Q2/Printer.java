public class Printer implements Communication,PowerManagement{
   
    private double battery;

    public void setBatteryLevel(double bat){
        this.battery = bat;
    }
    public double getBattery(){return this.battery;}

    public void connect(String connect){
        System.out.println("Printer Connected to Network");
    }

    public void PowerOn(){
        System.out.println("Printer Power on");
    }
    public void PowerOff(){
        System.out.println("Printer Power Off");
    }
    public double checkBattery(){
        System.out.println("Printer Battery: "+this.battery);
        return battery;
    }
}
