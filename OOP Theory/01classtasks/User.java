
import java.util.Scanner;

public class User {
    private String Username;
    private String Password;

    public int setUsername(String u){
        if (u.equals("")) {
            System.out.println("Username cannot be empty");
            return 0;
        }else{
            Username = u;
            return 1;
        }
    }
    public int setPassword(String p){
        if (p.length() < 8) {
            System.out.println("password cannot be less than 8 characters ");
            return 0;
        }else{
            boolean hasDigit = false;
            for (int i = 0; i < p.length(); i++) {
                if (Character.isDigit(p.charAt(i))) {
                   hasDigit = true; 
                   break;
                }
            }

            if (!hasDigit) {
                System.out.println("Password does not have atleast one digit");
                return 0;
            }

            Password = p;
            return 1;
        }   
    }

    public String getUsername(){
        return Username;
    }
    public String getPassword(){
        String temp="";

        if (Password!=null) {
            for (int i = 0; i < Password.length(); i++) {
                temp+="*";
            }            
        }

        return temp;
    }
    public static void main(String[] args) {
        User u1 = new User();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter username: ");
        u1.setUsername(input.next());

        System.out.println("Enter password: ");
        u1.setPassword(input.next());

        System.out.println("Username: "+u1.getUsername());
        System.out.println("Password: "+u1.getPassword());

    }
}
