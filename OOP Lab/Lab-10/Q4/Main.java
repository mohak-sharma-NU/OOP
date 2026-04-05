public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Toyota Corolla", 1800, "GLi 2026") {
            public void display() {
                class Owner {
                    private String ownerName;
                    private String CNIC;

                    public Owner(String ownerName, String CNIC) {
                        this.ownerName = ownerName;
                        this.CNIC = CNIC;
                    }

                    public String getOwnerName() {
                        return ownerName;
                    }

                    public String getCNIC() {
                        return CNIC;
                    }
                }

                Owner owner = new Owner("Ahmad Ali", "42201-1234567-8");
                System.out.println("Vehicle Name: " + getVehicleName());
                System.out.println("Engine CC: " + getEngineCC());
                System.out.println("Model: " + getModel());
                System.out.println("Owner Name: " + owner.getOwnerName());
                System.out.println("Owner CNIC: " + owner.getCNIC());
            }
        };

        v.display();
    }
}
Fix: add getters to Vehicle, use them in anonymous display.

But to match, assume print with getters.

Let's add getters to Vehicle for completeness.

But since new file, rewrite with getters.
