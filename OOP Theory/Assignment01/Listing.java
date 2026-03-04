public class Listing {

    private static int totalListings=0;

    private Vehicle vehicle;
    private int ListingID;
    private double Price;
    private double Mileage;
    private int postedDate;
    private String Status;
    private String Desc;

    private boolean approved;

    //---Contructors:

    public Listing(){}

    public Listing(int ListingID,double Price,double Mileage,int postedDate,String Status, String Desc,Vehicle vehicle){
        this.ListingID = ListingID;
        this.Price = Price;
        this.Mileage = Mileage;
        this.postedDate = postedDate;
        this.Status = Status;
        this.Desc = Desc;
        this.vehicle = vehicle;
    }

    public Listing(Listing obj){
        this.ListingID = obj.ListingID;
        this.Price = obj.Price;
        this.Mileage = obj.Mileage;
        this.postedDate = obj.postedDate;
        this.Status = obj.Status;
        this.Desc = obj.Desc;
    }

    //---Setters
    public void setListingID(int listingID){
        this.ListingID = listingID;
    }

    public void setPrice(double price){
        this.Price = price;
    }

    public void setMileage(double mileage){
        this.Mileage = mileage;
    }

    public void setPostedDate(int postedDate){
        this.postedDate = postedDate;
    }

    public void setStatus(String status){
        this.Status = status;
    }

    public void setDesc(String desc){
        this.Desc = desc;
    }

    public void setVehicle(Vehicle v){
        this.vehicle = v;
    }

    public void setApproved(boolean a){
        this.approved = a;
    }

    //---Getters

    public int getListingID(){
        return this.ListingID;
    }

    public double getPrice(){
        return this.Price;
    }

    public double getMileage(){
        return this.Mileage;
    }

    public int getPostedDate(){
        return this.postedDate;
    }

    public String getStatus(){
        return this.Status;
    }

    public String getDesc(){
        return this.Desc;
    }

    public Vehicle getVehicle(){
        return this.vehicle;
    }

    public boolean getApproved(){
        return this.approved;
    }
    //---Class Methods:

    public static void removeListing(){
        if (Listing.totalListings>0) {
            Listing.totalListings--;
        }
    }

    public static void addListing(){
        if (Listing.totalListings<100) {
            Listing.totalListings++;            
        }
    }

    public String Publish(){
        System.out.println("\nVehicle is published.\n");
        this.setStatus("ACTIVE");
        return this.getStatus();
    }

    public String markSold(){
        System.out.println("\nVehicle is marked Sold");
        this.setStatus("SOLD");
        return this.getStatus();
    }

    public void updatePrice(double newPrice){
        System.out.println("\nUpdating price\n");
        this.setPrice(newPrice);
    }

    public boolean isActive(){
        return this.getStatus().equals("ACTIVE");
    }

    public void displayListingInfo(){
        System.out.println("\nListing ID: "+this.getListingID()+
        "\tPrice: "+this.getPrice()+
        "\tMileage: "+this.getMileage()+
        "\tPosted date: "+this.getPostedDate()+
        "\tStatus: "+this.getStatus()+
        "\tDescription: "+this.getDesc()+
        "\n--VEHICLE INFO--\n"
    );

        this.vehicle.displaySpecs();
    }
    public static void main(String[] args) {
        
    }
}
