public class SCanner implements Communication,PowerManagement{
       
    private double battery;

    public void setBatteryLevel(double bat){
        this.battery = bat;
    }
    public double getBattery(){return this.battery;}
    
    public void connect(String connect){
        System.out.println("Scanner Connected to Network");
    }

    public void PowerOn(){
        System.out.println("Scanner Power on");
    }
    public void PowerOff(){
        System.out.println("Scanner Power Off");
    }
    public double checkBattery(){
        System.out.println("Scanner Battery: "+this.battery);
        return battery;
    }
}
