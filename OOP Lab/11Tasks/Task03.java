import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        String num1Str = input.nextLine();
        System.out.println("Enter second number:");
        String num2Str = input.nextLine();
        System.out.println("Enter operation (+ - * /):");
        String op = input.nextLine();
        
        if (num1Str == null || num1Str.isEmpty() || num2Str == null || num2Str.isEmpty()) {
            System.out.println("Input null or empty");
            input.close();
            return;
        }
        
        double num1, num2;
        try {
            num1 = Double.parseDouble(num1Str);
            num2 = Double.parseDouble(num2Str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
            input.close();
            return;
        }
        
        try {
            if (op.equals("/")) {
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                System.out.println("Result: " + (num1 / num2));
            } else if (op.equals("+")) {
                System.out.println("Result: " + (num1 + num2));
            } else if (op.equals("-")) {
                System.out.println("Result: " + (num1 - num2));
            } else if (op.equals("*")) {
                System.out.println("Result: " + (num1 * num2));
            } else {
                System.out.println("Invalid operation");
            }
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
        
        input.close();
    }
}
