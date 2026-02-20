public class Laptop {
    private String Brand;
    private int RAM;
    private int BatteryCap;
    private double BatteryBackup;

    public Laptop(String B,int r,int b,double bb){
        this.Brand = B;
        this.RAM = r;
        this.BatteryCap = b;
        this.BatteryBackup = bb;
    }

    public String getBrand(){return this.Brand;}

    public int getRam(){return this.RAM;}

    public int getBatteryCap(){return this.BatteryCap;}

    public double getBatteryBackup(){return this.BatteryBackup;}

    public void setBrand(String B){
        this.Brand = B;
    }

    public void setRam(int r){this.RAM = r;}

    public void setBatCap(int c){this.BatteryCap = c;}

    public void setBatBackup(double bb){this.BatteryBackup = bb;}
    
    public double calculateBatteryBackup(){
        return this.getBatteryCap()/(this.getRam()*500);
    }
}
