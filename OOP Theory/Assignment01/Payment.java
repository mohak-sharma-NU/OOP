
import java.util.Random;


public class Payment {

    private User user;
    private final int paymentId;     
    private double amount;
    private String paymentMethod;
    private String transactionDate;
    private String paymentStatus;
    private int referenceNumber;

    private static int totalPayments = 0;

    //   CONSTRUCTORS 

    public Payment(double amount, String paymentMethod, String transactionDate, String paymentStatus,int referenceNumber){
        this.paymentId = ++totalPayments;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.transactionDate = transactionDate;
        this.paymentStatus = paymentStatus;
        Random ran = new Random();
        this.referenceNumber = ran.nextInt(1000000);
    }

    /*  
        both default and copy construtor were skipped, as payment without amount is not realistic
        (no such thing as a free car)
     */
    //   SETTERS 

    public void setUser(User user){
        this.user = user;
    }

    public void setPaymentAmount(double amount) {
        this.amount = amount;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setReferenceNumber(int referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    //   GETTERS 

    public User getUser(){
        return this.user;
    }

    public int getPaymentId() {
        return this.paymentId;
    }

    public double getPaymentAmount() {
        return this.amount;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    public String getTransactionDate() {
        return this.transactionDate;
    }

    public String getPaymentStatus() {
        return this.paymentStatus;
    }

    public int getReferenceNumber() {
        return this.referenceNumber;
    }

    public static int getTotalPayments() {
        return Payment.totalPayments;
    }

    //   CLASS METHODS

    public void processPayment() {
        if (this.amount > 0) {
            this.paymentStatus = "COMPLETED";
        } else {
            this.paymentStatus = "FAILED";
        }
    }

    public void refundPayment() {
        if (paymentStatus.equalsIgnoreCase("COMPLETED")) {
            this.paymentStatus = "REFUNDED";
        }
    }

    public boolean verifyPayment() {
        return this.paymentStatus.equalsIgnoreCase("COMPLETED");
    }

    public void displayPaymentDetails() {
        System.out.println("\nPayment ID: " + this.getPaymentId() +
        "\nPayment Amount: " + this.getPaymentAmount() +
        "\nPayment Method: " + this.getPaymentMethod() +
        "\nPayment Transaction Date: " + this.getTransactionDate() +
        "\nPayment Status: " + this.getPaymentStatus() +
        "\nPayment Reference Number: " + this.getReferenceNumber());
    }

    public static void main(String[] args) {
        
    }
}
