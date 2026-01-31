import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two Double values: ");
        double n = input.nextDouble();
        double m = input.nextDouble();

        double product = n*m;

        System.out.println("\nResult: "+ product);
        
    }
}
