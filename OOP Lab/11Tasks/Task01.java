import java.util.Scanner;
import java.util.ArrayList;

public class Task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers separated by space:");
        String line = input.nextLine();
        String[] parts = line.split(" ");
        
        ArrayList<Integer> nums = new ArrayList<Integer>();
        boolean hasValid = false;
        
        for (int i = 0; i < parts.length; i++) {
            try {
                int num = Integer.parseInt(parts[i]);
                nums.add(num);
                hasValid = true;
            } catch (NumberFormatException e) {
                System.out.println(parts[i] + " skipped - not valid integer");
            }
        }
        
        if (!hasValid) {
            System.out.println("All inputs invalid, no average");
            input.close();
            return;
        }
        
        if (nums.size() == 0) {
            System.out.println("List empty or null");
            input.close();
            return;
        }
        
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        
        double avg = (double)sum / nums.size();
        System.out.println("Average: " + avg);
        
        input.close();
    }
}
