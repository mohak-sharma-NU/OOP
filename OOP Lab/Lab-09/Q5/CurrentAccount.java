public class CurrentAccount extends BankAccount{
        
    public double calculateInterest(double balance){
        return (balance>50000)?balance*0.02:0;
    }

}
