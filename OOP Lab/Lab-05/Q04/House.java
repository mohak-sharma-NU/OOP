public class House{
    
    private int HouseID;
    private String OwnerName;
    private Room room;

    public House(int ID,String name,int i,double p,double h){
        this.HouseID = ID;
        this.OwnerName = name;
        room = new Room(i, p, h);
    }   
    
    public double totalDailyElectricity(){
        return this.room.energyUsage();
    }

    public static void main(String[] args) {
        
        House h1 = new House(1002, "Sharma House", 9090, 15, 10);

        System.out.println("Total Electricity Consumption: "+h1.totalDailyElectricity());
    }
}