public class Main {
    
    public static void main(String[] args) {
        

        SavingsAccount s = new SavingsAccount();
        CurrentAccount c = new CurrentAccount();
        FixedDepositeAccount f = new FixedDepositeAccount();

        double balance = 10000;
        
        System.out.println("Using Savings Account: "+s.calculateInterest(balance));

        System.out.println("Using Current Account: "+c.calculateInterest(balance));

        System.out.println("Using Fixed Deposite Account: "+f.calculateInterest(balance));
    }
}
