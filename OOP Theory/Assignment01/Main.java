
import java.util.Scanner;

public class Main {

    public Scanner input = new Scanner(System.in);

    public int Login(MarketPlace m) {

        String email;
        String password;

        while (true) {

            System.out.print("Enter Email: ");
            email = input.next();

            System.out.print("Enter Password: ");
            password = input.next();

            User[] users = m.getUsersArray();

            boolean userFound = false;

            for (int i = 0; i < users.length; i++) {

                if (users[i] == null) {
                    break;
                }

                if (email.equals(users[i].getEmail())|| email.equals(users[i].getName())) {

                    userFound = true;

                    if (password.equals(users[i].getPassword())) {
                        System.out.println("Login Successful");
                        return users[i].getUserID();
                    } else {
                        System.out.println("Password does not match");
                        break;
                    }
                }
            }

            if (!userFound) {
                System.out.println("User not found. Try again.");
            }
        }
    }

    public void adminMenu(MarketPlace m,User currUSer){

        System.out.println("Welcome, (ADMIN)");

        int ch = -1,id;
        while (ch!=0) {
            System.out.println("Enter choice: ");
            System.out.println("\n1.Delete Listing.\n2.Approve Listing\n3.Show all Listings.\n0Exit as Admin");

            ch = input.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter listing ID to delete: ");
                    id = input.nextInt();
                    m.deleteListing(id);
                    break;
                case 2:
                    System.out.println("Enter the Listing ID to approve");
                    id = input.nextInt();
                    m.approveListing(id,currUSer);
                    break;
                case 3:
                    m.displayAllListings();
                    break;
                default:
                    break;
            }
        }

    }

    public void buyerMenu(MarketPlace m,User buyer){
        System.out.println(" Welcome, (BUYER)");

        int ch = -1;

        while (ch != 0) {
            System.out.println("Search by: \n1.Brand\n2.Price Range\n3.Model\n4.Year\n5.Mileage\n6.Display All Listings");
            System.out.println("\nOR\n7.Add Favorites\n0.Exit");
            ch = input.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter Brand Name: ");
                    m.searchByBrand(input.next());
                    break;
                case 2:
                    System.out.println("Enter Lower bound: ");
                    double lower = input.nextDouble();
                    System.out.println("Enter upper bound");
                    double upper = input.nextDouble();
                    m.searchByPriceRange(lower, upper);
                    break;
                case 3:
                    System.out.println("Enter Model");
                    m.searchByModel(input.next());
                    break;
                case 4: 
                    System.out.println("Enter year: ");
                    m.searchByYear(input.nextInt());
                    break;
                case 5:
                    System.out.println("Enter mileage: ");
                    m.searchByMileage(input.nextDouble());
                    break;
                case 6:
                    m.displayAllListings();
                    break;
                case 7:
                    m.displayAllListings();
                    int id =0;
                    while (id>=0) {                    
                        System.out.println("Enter listing ID to add to Favorites: (-1 to exit)");

                        id = input.nextInt();

                        Listing found = m.searchbyID(id);

                        if (found == null) {
                            System.out.println("The Listing was not found");
                        }else{
                            buyer.addFavorite(found);
                        }

                    }

                    break;
                default:
                    break;
            }
        }

    }

    public void sellerMenu(MarketPlace m,User seller){

    }

    public void register(MarketPlace m){
        System.out.println("Enter details to register: ");
        System.out.print("Username: ");
        String username = input.next();
        System.out.println("Email: ");
        String email = input.next();
        System.out.println("password: ");
        String password = input.next();
        System.out.println("Phone Number: ");

        String roleType="";

        System.out.println("Are you a buyer or SELLER?\n1.BUYER\n2. SELLER");
        int choice = input.nextInt();

        if (choice == 1) {
            roleType = "BUYER";
        }else if (choice == 2) {
            roleType = "SELLER";
        }else{roleType = "BUYER";}

        if (
            !(username.equals("ADMIN")||username.equals(""))//username must NOT be "ADMIN" or empty
            &&!(email.equals(""))//email must not be empty
            &&!(password.equals(""))) //password not be empty
        {
            Role role = new Role(roleType, 1, 10, false, false);
            User user = new User(username, email, password, 0, "ACTIVE", role);
            m.registerUser(user);
        }
    }



    public static void main(String[] args){

        Main m = new Main();

        Scanner input = new Scanner(System.in);


        MarketPlace m1 = new MarketPlace();

        Role r0 = new Role("ADMIN",100,0,false,false);
        User u0 = new User("ADMIN","admin@gmail.com","9090",0,"ACTIVE",r0);

        m1.registerUser(u0);

        Role r1 = new Role("BUYER",1,10,true,true);
        User u1 = new User("buyer1","buyer1@gmail.com","1223",10101,"ACTIVE",r1);

        m1.registerUser(u1);

        Role r2 = new Role("SELLER",1,10,true,true);
        User u2 = new User("seller1","seller1@gmail.com","9887",10201,"ACTIVE",r2);

        m1.registerUser(u2);

        Engine e1 = new Engine("1101838827",130,1000,"PETROL","AUTOMATIC","USED");
        Vehicle v1 = new Vehicle("HONDA","CIVIC",2009,1000,"PETROL",e1,u2);

        Listing l1 = new Listing(1,100,10,10326,"ACTIVE","2009 HONDA CIVIC",v1);
        m1.addListing(l1,0);


        int choice=0;
        while (choice!=3) {
            System.out.println("Welcome to PAKWHEELS.com\nLogin or Register to continue: ");
            System.out.println("\n1.Login\n2.Register\n3.Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    int id = m.Login(m1);
                    User currentUser = m1.findUserById(id);

                    if (currentUser.getRole().getRoleType().equals("ADMIN")) {
                        System.out.println("Welcome to admin menu");
                        m.adminMenu(m1,currentUser);
                    } else if (currentUser.getRole().getRoleType().equals("BUYER")) {
                        System.out.println("Welcome to Buyer menu");
                        m.buyerMenu(m1,currentUser);
                        // buyer menu
                    } else {
                        m.sellerMenu(m1,currentUser);
                        // seller menu
                    }                    
                    break;
                
                case 2:
                    m.register(m1);
                    break;
                case 3:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invaid Choice.");
                    break;
            }

        }


        // input.close();

    }
}
