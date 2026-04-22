import java.util.*;
import java.io.*;

public class Task06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student full name:");
        String name = input.nextLine();
        System.out.println("Enter student ID:");
        String id = input.nextLine();
        
        String filename = name.replaceAll("[^a-zA-Z0-9]", "_") + ".txt";
        
        System.out.println("Enter PF Lab score:");
        int pfLab = input.nextInt();
        System.out.println("Enter PF Theory score:");
        int pfTheory = input.nextInt();
        input.nextLine();
        
        ArrayList<String> courses = new ArrayList<String>();
        int credits = 0;
        
        if (pfLab >= 50 && pfTheory >= 50) {
            courses.add("OOP Lab");
            courses.add("OOP Theory");
            credits = 6;
        }
        
        if (credits <= 15) {
            try {
                PrintWriter writer = new PrintWriter(new FileWriter(filename));
                writer.println("Name: " + name);
                writer.println("ID: " + id);
                writer.println("PF Lab: " + pfLab + " PF Theory: " + pfTheory);
                writer.println("Courses:");
                for (int i = 0; i < courses.size(); i++) {
                    writer.println(courses.get(i));
                }
                writer.println("Total credits: " + credits);
                writer.close();
                System.out.println("Data written to " + filename);
            } catch (IOException e) {
                System.out.println("File write error");
                input.close();
                return;
            }
        } else {
            System.out.println("Credits exceed 15");
        }
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            System.out.println("File contents:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File read error");
        }
        
        input.close();
    }
}
