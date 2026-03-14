public class Main {
    

    public static void main(String[] args) {
        
        Car c1 = new Car(1,"Honda",180,"Petrol");
        Truck t1 = new Truck(2, "Peterbilt", 110, "Diesel");
        MotorBike m1 = new MotorBike(3, "Ducati", 210, "Petrol");
        Bus b1 = new Bus(4, "Hino Pak", 100, "Diesel");

        c1.openSunroof();
        t1.loadCargo(100);
        m1.popwheehlie();
        b1.pickPassengers(100);
        t1.unloadCargo();
        b1.dropPassengers();


        c1.printVehicleInfo();
        t1.printVehicleInfo();
        m1.printVehicleInfo();
        b1.printVehicleInfo();
        
    }
}
