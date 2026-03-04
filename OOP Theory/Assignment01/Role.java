public class Role {

    private String RoleType;
    private int PermissionMask;
    private int ListingLimit;
    private boolean CanApproveListings;
    private boolean CanSendMessages;
    private boolean CanMakePayments;


    //   CONSTRUCTORS

    public Role(){
        this.RoleType = "BUYER";
    }

    public Role(String roleType, int permissionMask, int listingLimit , boolean canSendMessages, boolean canMakePayments){
        this.RoleType = roleType;
        this.PermissionMask = permissionMask;
        this.ListingLimit = listingLimit;
        this.CanApproveListings = roleType.equals("ADMIN");            
        this.CanSendMessages = canSendMessages;
        this.CanMakePayments = canMakePayments;
    }

    public Role(Role r){
        this.RoleType = r.RoleType;
        this.PermissionMask = r.PermissionMask;
        this.ListingLimit = r.ListingLimit;
        this.CanApproveListings = r.RoleType.equals("ADMIN");            
        this.CanSendMessages = r.CanSendMessages;
        this.CanMakePayments = r.CanMakePayments;
    }


    //   SETTERS

    public void setRoleType(String roleType) {
        this.RoleType = roleType;
    }

    public void setPermissionMask(int permissionMask) {
        this.PermissionMask = permissionMask;
    }

    public void setListingLimit(int listingLimit) {
        this.ListingLimit = listingLimit;
    }

    public void setCanApproveListings(boolean canApproveListings) {
        this.CanApproveListings = canApproveListings;
    }

    public void setCanSendMessages(boolean canSendMessages) {
        this.CanSendMessages = canSendMessages;
    }

    public void setCanMakePayments(boolean canMakePayments) {
        this.CanMakePayments = canMakePayments;
    }

    //   GETTERS

    public String getRoleType() {
        return this.RoleType;
    }

    public int getPermissionMask() {
        return this.PermissionMask;
    }

    public int getListingLimit() {
        return this.ListingLimit;
    }

    public boolean CanApproveListings() {
        return this.CanApproveListings;
    }

    public boolean CanSendMessages() {
        return this.CanSendMessages;
    }

    public boolean CanMakePayments() {
        return this.CanMakePayments;
    }

    //   CLASS METHODS

    public boolean hasPermission(int permissionBit) {
        return (PermissionMask & permissionBit) != 0;
    }

    public void upgradeListingLimit(int increment) {
        this.ListingLimit += increment;
    }

    public void downgradeListingLimit(int decrement) {
        if (ListingLimit - decrement >= 0) {
            this.ListingLimit -= decrement;
        }
    }

    public void displayRoleInfo() {
        System.out.println("\nRole Type: " + this.getRoleType() +
        "\nRole Permission Mask: " + this.getPermissionMask() +
        "\nRole Listing Limit: " + this.getListingLimit() +
        "\nRole Can Approve Listings: " + this.CanApproveListings() +
        "\nRole Can Send Messages: " + this.CanSendMessages() +
        "\nRole Can Make Payments: " + this.CanMakePayments());
    }

}

