public class Device {

    private int deviceID;
    private double powerRatings;
    private double hoursUsed;

    public Device(int i,double p,double h){
        this.deviceID = i;
        this.powerRatings = p;
        this.hoursUsed = h;
    }

    public double dailyEnergy(){
        return this.powerRatings*this.hoursUsed;
    }
}
