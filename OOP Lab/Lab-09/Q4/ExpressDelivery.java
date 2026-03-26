public class ExpressDelivery extends Delivery {

    public double calculateCost(double orderAmount){
        return orderAmount+200;
    }
}
