public class ElectricBill {

    public double calculateBill(int numberofUnits){
        return numberofUnits*10;
    }

    public double calculateBill(int numberofUnits,String customerType){
        double rateperUnit;
        if (customerType.equals("DOMESTIC")) {
            rateperUnit = 10;
        } else {
            rateperUnit = 15;
        }
        return numberofUnits*rateperUnit;
    }

    public double calculateBill(int numberofUnits,String customerType,boolean LoyaltyStatus){
        double rateperUnit,loyaltydiscount;
        if (customerType.equals("COMMERCIAL")) {
            rateperUnit = 15;
        } else  {
            rateperUnit = 10;
        }

        if (LoyaltyStatus) {
            loyaltydiscount = 0.05;
        } else {
            loyaltydiscount = 0;
        }
        return numberofUnits*rateperUnit*(1-loyaltydiscount);
    }


    public static void main(String[] args) {

        ElectricBill e = new ElectricBill();

        int numberOfUnits = 161;
        String CustomerType = "COMMERCIAL";
        boolean loyalty = true;

        System.out.println("Using Only Number of Units: "+e.calculateBill(numberOfUnits));

        System.out.println("Using number of Units AND Customer Type: "+e.calculateBill(numberOfUnits, CustomerType));

        System.out.println("Using number of units, customer type AND Loyalty: "+e.calculateBill(numberOfUnits, CustomerType, loyalty));

    }
}
