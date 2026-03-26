public class DiscountCalculator {
    
        
    public double calculatePrice(double price){
        return price;
    }

    public double calculatePrice(double price,double discountPer){
        return price - (discountPer*price);
    }    
    public double calculatePrice(double price,double discountPer,double couponAmount){
        return price - (discountPer*price) - couponAmount;
    }

    public static void main(String[] args) {

        DiscountCalculator d = new DiscountCalculator();
        
        double price  = 10.99;

        double per = 0.25;

        double coupon = 0.99;

        System.out.println("\nUsing Just price: "+d.calculatePrice(price));

        System.out.println("\nUsing Price AND Discount Percentage: "+d.calculatePrice(price, per));

        System.out.println("\nUsing Price, Discount AND Coupon: "+d.calculatePrice(price, per, coupon));

    }
}
