import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer as string:");
        String numStr = input.nextLine();
        
        if (numStr == null || numStr.isEmpty()) {
            System.out.println("Input null or empty");
            input.close();
            return;
        }
        
        int n;
        try {
            n = Integer.parseInt(numStr);
        } catch (NumberFormatException e) {
            System.out.println("Not valid integer");
            input.close();
            return;
        }
        
        if (n < 0) {
            System.out.println("Negative number not allowed");
            input.close();
            return;
        }
        
        long fact = 1;
        boolean overflow = false;
        for (int i = 1; i <= n; i++) {
            if (fact > Long.MAX_VALUE / i) {
                overflow = true;
                break;
            }
            fact *= i;
        }
        
        if (overflow) {
            System.out.println("Integer overflow");
        } else {
            System.out.println("Factorial: " + fact);
        }
        
        input.close();
    }
}
