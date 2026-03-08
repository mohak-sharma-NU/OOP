public class BankAccount {
    public String accountNumber;
    public String accountHolderName;
    private double balance;

    public void deposit(double deposit){
        this.setBalance(this.getBalance()+deposit);
    }
    public void withdraw(double amount){
        this.setBalance(this.getBalance()-amount);
        System.out.println("Withdrawing Amount");
    }

    public void setBalance(double b){
        this.balance = b;
    }
    public double getBalance(){return this.balance;}

}
