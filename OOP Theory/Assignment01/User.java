/*User
Base abstraction for system actors.

Data members

userId

name

email

phone

joinDate

accountStatus

Functions

login()

logout()

updateProfile()

deactivateAccount()

This prevents duplication across Buyer, Seller, Admin. */

/*
    public ContructorName(){}

    public Constructor(dataType dm){
        this.DataMamber = dm;
    }
    
    public Constructor(Classname Obj){
        this.DataMember = Obj.DataMember;
    }

*/

public class User {
    
    private Role role;
    private static int UserID=0;
    private String Name;
    private String Email;
    private String Password;
    private int JoinDate;
    private String AccountStatus;
    private Listing[] favListings;
    private static int favcount = 0;

    //   CONSTRUCTORS

    public User(){}

    public User(String Name,String Email,String password,int JoinDate,String AccountStatus,Role role){
        User.UserID = UserID++;
        this.Name = Name;
        this.Email = Email;
        this.Password = password;
        this.JoinDate = JoinDate;
        this.AccountStatus = AccountStatus;
        this.role = new Role(role);
    }

    // public User(User obj){
    //     this.UserID = obj.UserID;
    //     this.Name = obj.Name;
    //     this.Email = obj.Email;
    //     this.PhoneNumber = obj.PhoneNumber;
    //     this.JoinDate = obj.JoinDate;
    //     this.AccountStatus = obj.AccountStatus;
    // }

    //   SETTERS

    // public void setUserID(int userID){
    //     this.UserID = userID;
    // }

    public void setName(String name){
        this.Name = name;
    }

    public void setEmail(String email){
        this.Email = email;
    }

    public void setJoinDate(int joinDate){
        this.JoinDate = joinDate;
    }

    public void setAccountStatus(String accountStatus){
        this.AccountStatus = accountStatus;
    }

    //   GETTERS

    public Role getRole(){
        return this.role;
    }

    public int getUserID(){
        return UserID;
    }

    public String getName(){
        return this.Name;
    }

    public String getEmail(){
        return this.Email;
    }

    public String getPassword(){return this.Password;}

    public int getJoinDate(){
        return this.JoinDate;
    }

    public String getAccountStatus(){
        return this.AccountStatus;
    }

    //   CLASS METHODS

    /*
    
        this.favListings[User.favcount] = l;
        User.favcount++; */

    public void addFavorite(Listing l){
        this.favListings[User.favcount] = l;
        User.favcount++; 
    }

    public void removeFavorite(Listing l){
        for (int i = 0; i < favListings.length; i++) {
            if(l == favListings[i]){
                for (int j = i; j < favListings.length; j++){
                    if(j+1<favListings.length)
                        favListings[j] = favListings[j+1];
                }
                break;
            }
        }
    }

    public String getEncryptedPassword(){
        String result ="";
        for (int i = 0; i<this.getPassword().length(); i++) {
            result = result.concat("*");
        }

        return result;
    }

    public void displayUserInfo(){
        System.out.println("Username "+this.getName()+
        "\tUser Email: "+this.getEmail()+
        "\tUser Password: "+this.getEncryptedPassword()+
        "\tUser Join Date: "+this.getJoinDate()+
        "\tUser Account Status:  "+this.getAccountStatus());

        System.out.println("USER ROLE: ");
        this.role.displayRoleInfo();
    }

    public static void main(String[] args) {
        
    }

}
