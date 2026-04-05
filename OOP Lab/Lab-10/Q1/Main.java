public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 2024, 25000);
        Vehicle truck = new Truck("Ford", "F150", 2020, 30000, 3000);
        
        System.out.printf("Car %s %s (%d) sale price: %.2f%n", car.getMake(), car.getModel(), car.getYear(), car.getSalePrice());
        System.out.printf("Truck %s %s (%d) sale price: %.2f%n", truck.getMake(), truck.getModel(), truck.getYear(), truck.getSalePrice());
    }
}
