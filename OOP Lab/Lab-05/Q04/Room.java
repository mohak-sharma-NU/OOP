public class Room {

    private Device device;

    public double energyUsage(){
        return device.dailyEnergy();
    }

    public Room(int i,double p,double h){
        device = new Device(i, p, h);
    }
}
