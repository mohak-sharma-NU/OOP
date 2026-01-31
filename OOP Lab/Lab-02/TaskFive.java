import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.println("Enter Radius of Circle: ");
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        System.out.printf("Diameter: %f\nCircumference: %f\nArea: %f",r*2,2*pi*r,pi*r*r);
    }
}
