import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextLine());
        }
        
        String desktop = System.getProperty("user.home") + "/Desktop/elements.txt";
        
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(desktop));
            for (int i = 0; i < list.size(); i++) {
                writer.write(list.get(i));
                writer.newLine();
            }
            writer.close();
            System.out.println("Written to file");
        } catch (IOException e) {
            System.out.println("Write error");
            input.close();
            return;
        }
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(desktop));
            System.out.println("Reading back:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Read error");
        }
        
        try {
            Files.delete(Paths.get(desktop));
            System.out.println("File deleted");
        } catch (IOException e) {
            System.out.println("Delete error");
        }
        
        input.close();
    }
}
