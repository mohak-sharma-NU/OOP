public class FixedDepositeAccount extends BankAccount{
        
    public double calculateInterest(double balance){
        return (balance>200000)?balance*0.10:balance*0.08;
    }
}
