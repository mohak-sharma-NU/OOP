public class Car extends Vehicle {
    private double basePrice;

    public Car(String make, String model, int year, double basePrice) {
        super(make, model, year);
        this.basePrice = basePrice;
    }

    public double getSalePrice() {
        int currentYear = 2026;
        int age = currentYear - getYear();
        double coeff;
        if (age < 3) {
            coeff = 1.2;
        } else if (age <= 10) {
            coeff = 0.9;
        } else {
            coeff = 0.5;
        }
        return basePrice * coeff;
    }
}
