import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks of Five subjects (out of 100 marks each): ");
        
        int[] subjects = new int[5];
        float sum=0;
        float per=0;

        for (int i = 0; i < subjects.length; i++) {
            subjects[i] = input.nextInt();
            sum+=subjects[i];
        }

        per = (sum/500)*100;

        System.out.printf("Sum: %f Percentage: %f",sum,per);

        input.close();
    }
}
