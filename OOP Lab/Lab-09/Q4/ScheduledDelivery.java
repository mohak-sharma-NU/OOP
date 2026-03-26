public class ScheduledDelivery extends Delivery{
    public double calculateCost(double orderAmount,int noOFDaysAgo){
        return (noOFDaysAgo>1)?orderAmount+100:orderAmount+150;
    }
}