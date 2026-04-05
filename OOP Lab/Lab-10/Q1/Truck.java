public class Truck extends Vehicle {
    private double basePrice;
    private int weightCapacity;

    public Truck(String make, String model, int year, double basePrice, int weightCapacity) {
        super(make, model, year);
        this.basePrice = basePrice;
        this.weightCapacity = weightCapacity;
    }

    public double getSalePrice() {
        double premium;
        if (weightCapacity < 2000) {
            premium = 5000;
        } else if (weightCapacity <= 5000) {
            premium = 10000;
        } else {
            premium = 20000;
        }
        return basePrice + premium;
    }
}
