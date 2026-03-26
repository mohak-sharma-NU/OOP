public class StandardDelivery extends Delivery{
    public double calculateCost(double orderAmount){
        return (orderAmount>2000)?orderAmount:orderAmount+100;
    }
}
