
import java.util.Scanner;

public class Task04 {
    



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sen = input.nextLine();
        
        if (sen == null || sen.isEmpty()) {
            System.out.println("Input null or empty");
            input.close();
            return;
        }
        
        String[] words = sen.split(" ");
        if (words.length < 2) {
            System.out.println("Less than two words");
            input.close();
            return;
        }
        
        System.out.println("Words count: " + words.length);
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        
        input.close();
    }

}