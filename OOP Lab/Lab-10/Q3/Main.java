public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Mehran", "4T");
        Car.Engine e1 = c1.new Engine();
        e1.setEngine();
        System.out.println("Car: " + c1.getCarName() + " " + c1.getCarType() + ", Engine: " + e1.getEngineType());

        Car c2 = new Car("Corolla", "4T");
        Car.Engine e2 = c2.new Engine();
        e2.setEngine();
        System.out.println("Car: " + c2.getCarName() + " " + c2.getCarType() + ", Engine: " + e2.getEngineType());

        Car c3 = new Car("Civic", "6T");
        Car.Engine e3 = c3.new Engine();
        e3.setEngine();
        System.out.println("Car: " + c3.getCarName() + " " + c3.getCarType() + ", Engine: " + e3.getEngineType());
    }
}
