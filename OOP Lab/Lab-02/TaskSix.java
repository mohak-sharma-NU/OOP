
import java.util.Scanner;

public class TaskSix {

    public static void main(String[] args) {
        String name;
        String ID;
        String[] courses = new String[5];
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your FULL name: ");
        name = input.nextLine();

        System.out.println("Enter your ID: ");
        ID = input.next();

        System.out.println("Enter your registered courses:");
        for (int i = 0; i < courses.length; i++) {
            courses[i] = input.next();
        }

        System.out.println("=== STUDENT INFORMATION ===");
        System.out.printf("Name: %s\nStudent ID: %s\nCourses:\n ",name,ID);

        for (int i=0;i<courses.length;i++) {
            System.out.println((i+1)+": " + courses[i]);
        }
    }
}
