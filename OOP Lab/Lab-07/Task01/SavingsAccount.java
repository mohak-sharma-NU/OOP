public class SavingsAccount extends BankAccount {
    public double interestRate;

    public double calculateInterest(){
        double interestamount = this.getBalance()*(this.interestRate/100);
        this.setBalance(this.getBalance()+interestamount);
        return interestamount;
    }

    public void print(){
        System.out.println("Account Number: "+this.accountNumber+
        "\nAccount Holder: "+this.accountHolderName+
        "\nAccount Balance: "+this.getBalance()+
        "\nAccount's Annual Interest: "+this.interestRate
        );
    }

    public static void main(String[] args) {

        SavingsAccount s1 = new SavingsAccount();

        s1.interestRate = 5;

        s1.accountHolderName = "Mohak";
        s1.accountNumber = "287365283";
        s1.setBalance(10000);


        s1.deposit(2000);

        s1.withdraw(500);

        s1.calculateInterest();

        s1.print();
        
    }
}
