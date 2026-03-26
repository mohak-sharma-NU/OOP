public class FoodDelivery {
    

    public double calculateFoodPrice(double price){
        return price;
    }

    public double calculateFoodPrice(double price,double deliveryDistance){
        return price+deliveryDistance*20;
    }
    
    public double calculateFoodPrice(double price,double deliveryDistance,String couponCode){

        double coupondiscount; 

        if (couponCode.equals("SAVE10")) {
            coupondiscount = 0.1*price;
        } else {
            coupondiscount = 0;
        }
        return price+deliveryDistance*20 - coupondiscount;
    }


    public static void main(String[] args) {
        FoodDelivery f = new FoodDelivery();

        double price = 5.99;

        double distance = 10.99;

        String coupon = "SAVE10";

        System.out.println("Using Just Price: " + f.calculateFoodPrice(price));

        System.out.println("Using Price AND Distance: "+f.calculateFoodPrice(price, distance));

        System.out.println("Using Price, Distance AND Coupon: "+f.calculateFoodPrice(price, distance, coupon));
    
    }
}
