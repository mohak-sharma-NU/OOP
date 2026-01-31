
import java.util.Scanner;

public class TaskTen {
    
    
    private String Username;
    private int Password;
    private float Balance;

    private int upperLimit = 5000;
    private int lowerLimit = 100;

    public int getUpperLimit(){
        return upperLimit;
    }
    public int getlowerLimit(){
        return lowerLimit;
    }

    public TaskTen(String name,int pass,float bal){
        Username = name;
        Password = pass;
        Balance = bal;
    }

    public void setBalance(float  bal){
        Balance = bal;
    }
    public String getUsername(){
        return Username;
    }
    public int getPassword(){
        return Password;
    }
    public float getBalance(){
        return  Balance;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        TaskTen t1 = new TaskTen("Mohak",12345,10000);

        String name;
        System.out.println("Enter your Username: ");
        name = input.nextLine();

        int password;
        System.out.println("Enter your password: ");
        password = input.nextInt();

        int choice;
        char a = 'Y';
        float amount;
        if (name.equals(t1.getUsername()) && password == t1.getPassword()) {
            do { 
                System.out.println("MAIN MENU\n **Welcome to the Bank of Pakistan**");
                System.out.println("1.Deposit Money\n2.Withdraw Money\n3.Account Status.\nMake your choice: ");
                choice = input.nextInt();
                
                switch (choice) {
                    case 1:
                        System.out.println("Enter the amount you want to Deposit: ");
                        amount = input.nextFloat();
                        if (amount<=t1.getUpperLimit()&&amount>=t1.lowerLimit){
                            t1.setBalance((t1.getBalance())+amount);                                
                        }
                        break;
                    case 2:
                        System.out.println("Enter the amount you want to Withdraw: ");
                        amount = input.nextFloat();
                        if (amount<=t1.getUpperLimit()&&amount>=t1.lowerLimit){
                            if (t1.getBalance()>amount) {
                                t1.setBalance((t1.getBalance())-amount);                                
                            }else{
                                System.out.println("Entered amount is greater than balance");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Account Status: \n");
                        System.out.println("Username: "+t1.getUsername()+"\nBalance: "+t1.getBalance());
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }

                System.out.println("Do you want to continue(y/Y)?");
                a = input.next().charAt(0);

            }while (a=='Y'||a=='y');

                System.out.println("Account Status: \n");
                System.out.println("Username: "+t1.getUsername()+"\nBalance: "+t1.getBalance());

        }else{
            System.out.println("Username or Password is incorrect.");
        }
    }
}
