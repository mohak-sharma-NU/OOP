public class Car {
    private String carName;
    private String carType;

    public Car(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }

    public String getCarName() {
        return carName;
    }

    public String getCarType() {
        return carType;
    }

    class Engine {
        private String engineType;

        public void setEngine() {
            if ("4T".equals(getCarType())) {
                if ("Mehran".equals(getCarName())) {
                    engineType = "small";
                } else {
                    engineType = "large";
                }
            } else {
                engineType = "Bigger";
            }
        }

        public String getEngineType() {
            return engineType;
        }
    }
}
