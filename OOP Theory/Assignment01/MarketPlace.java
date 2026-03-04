public class MarketPlace {

    private String systemName;
    private User[] users;
    private Listing[] listings;
    private Message[] messages;
    private static int messagesCounter;
    private Payment[] payments;
    private int totalUsers;

    private static int totalMarketplaces = 0;

    //   CONSTRUCTORS 

    public MarketPlace() {
        this.systemName = "PakWheels.com";
        this.users = new User[100];
        this.listings = new Listing[100];
        this.messages = new Message[200];
        messagesCounter = 0;
        this.payments = new Payment[200];
        this.totalUsers = 0;
        totalMarketplaces++;
    }

    //   SETTERS 

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    //   GETTERS 

    public String getSystemName() {
        return this.systemName;
    }

    public Listing[] getListingsarray(){
        return this.listings;
    }

    public User[] getUsersArray(){
        return this.users;
    }

    public int getTotalUsers() {
        return this.totalUsers;
    }

    public static int getTotalMarketplaces() {
        return totalMarketplaces;
    }

    //   CLASS METHODS 

    public User findUserById(int id){

        for (int i = 0; i < users.length; i++) {
            if (users[i].getUserID() == id) {
                return users[i];
            }
        }

        return null;
    }

    public void registerUser(User user) {
        if (this.totalUsers < this.users.length) {
            this.users[this.totalUsers] = user;
            this.totalUsers++;
        }
    }

    public void addListing(Listing listing, int index) {
        if (index >= 0 && index < this.listings.length) {
            this.listings[index] = listing;
            Listing.addListing();
        }
    }

    public void addMessage(Message message, int index) {
        if (index >= 0 && index < this.messages.length) {
            this.messages[index] = message;
        }
    }

    public void updateListing(int ListingID,double newPrice){
        for (int i = 0; i < listings.length; i++) {
            if(ListingID == listings[i].getListingID() ){
                listings[i].setPrice(newPrice);
                break;
            }
        }
    }

    public void deleteListing(int ListingID){
        for (int i = 0; i < listings.length; i++) {
            if(ListingID == listings[i].getListingID()){
                for (int j = i; j <= listings.length; j++){
                    if(j+1 < listings.length)
                        listings[j] = listings[j+1];
                }
                break;
            }
        }
    }

    public Listing searchbyID(int ID){
        for (int i = 0; listings[i]!=null; i++) {
            if (listings[i].getListingID() == ID) {
                return listings[i];
            }
        }
        return null;
    }

    public void searchByBrand(String brand){
        for (int i = 0; i < listings.length; i++) {
            if(brand.equalsIgnoreCase(listings[i].getVehicle().getVehicleBrand())){
                listings[i].displayListingInfo();
            }
        }
    }
    
    public void searchByPriceRange(double priceupper,double pricelower){
        for (int i = 0; i < listings.length; i++) {
            if(listings[i].getPrice()<=priceupper&&listings[i].getPrice()>=pricelower){
                listings[i].displayListingInfo();
            }
        }
    }
        
    public void searchByModel(String Model){
        for (int i = 0; i < listings.length; i++) {
            if(Model.equalsIgnoreCase(listings[i].getVehicle().getVehicleModel())){
                listings[i].displayListingInfo();
            }
        }
    }

    public void searchByYear(int year){
        for (int i = 0; i < listings.length; i++) {
            if(year == listings[i].getVehicle().getVehicleYear()){
                listings[i].displayListingInfo();
            }
        }
    }

    public void searchByMileage(double mileage){
        for (int i = 0; i < listings.length; i++) {
            if(mileage == listings[i].getMileage()){
                listings[i].displayListingInfo();
            }
        }
    }

    public void displayAllListings(){
        System.out.println("--LISTINGS--");

        for (int i = 0; i < this.listings.length; i++) {
            if(listings[i]==null)
                return;
            else{
                if (listings[i].getApproved()) {
                    listings[i].displayListingInfo();
                }
            }
        }
    }

    public void displayMarketplaceInfo() {
        System.out.println("\nMarketplace Name: " + this.getSystemName() +
        "\nMarketplace Total Users: " + this.getTotalUsers() +
        "\nMarketplace Total Marketplaces Created: " + getTotalMarketplaces());
    }

    public void displayAllUSers(){
        System.out.println("Users info: ");
        for (int i = 0; users[i]!=null; i++) {
            users[i].displayUserInfo();
        }
    }
    public void sendMessage(User sender, User reciever, String msg){
        this.messages[messagesCounter].setContent(msg);
        this.messages[messagesCounter].setReceiverId(reciever.getUserID());
        this.messages[messagesCounter].setSenderId(sender.getUserID());
        messagesCounter++;
    }

    public void approveListing(int id,User currUser){
        Listing l  = this.searchbyID(id);
        if(l.getListingID()>0&&currUser.getRole().CanApproveListings()){
            l.setApproved(true);
        }
    }

    public static void main(String[] args) {
        
    }
}