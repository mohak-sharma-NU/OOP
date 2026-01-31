import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first value: ");    
        int n1 = input.nextInt();
        System.out.println("Enter Second number: ");
        int n2 = input.nextInt();
        System.out.println("Addition: "+ (n1+n2)+"\nSubtraction: "+(n1-n2)+"\nMultiplication: "+(n1*n2));
        if(n2!=0){
            System.out.println("\nDivision: "+(n1/n2));
            System.out.println("\nModulus: "+(n1%n2));
        }else{
            System.out.println("Cannot divide by zero.");
        }
    }
}
