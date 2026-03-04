public class Message {

    private final int messageId;    
    private int senderId;
    private int receiverId;
    private int listingId;
    private String content;
    private String timestamp;

    private static int totalMessages = 0;

    //   CONSTRUCTORS 

    public Message(int senderId, int receiverId, int listingId, String content, String timestamp) {
        this.messageId = ++totalMessages;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.listingId = listingId;
        this.content = content;
        this.timestamp = timestamp;
    }

    //   SETTERS 

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public void setListingId(int listingId) {
        this.listingId = listingId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    //   GETTERS 

    public int getMessageId() {
        return this.messageId;
    }

    public int getSenderId() {
        return this.senderId;
    }

    public int getReceiverId() {
        return this.receiverId;
    }

    public int getListingId() {
        return this.listingId;
    }

    public String getContent() {
        return this.content;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public static int getTotalMessages() {
        return totalMessages;
    }

    //   CLASS METHODS 

    public void sendMessage() {
        System.out.println("Message sent from User " + this.senderId +
                           " to User " + this.receiverId);
    }

    public void editMessage(String newContent) {
        this.setContent(newContent);
    }

    public boolean isRelatedToListing(int listingId) {
        return this.getListingId() == listingId;
    }

    public void displayMessageDetails() {
        System.out.println("\nMessage ID: " + this.getMessageId() +
        "\nMessage Sender ID: " + this.getSenderId() +
        "\nMessage Receiver ID: " + this.getReceiverId() +
        "\nMessage Listing ID: " + this.getListingId() +
        "\nMessage Content: " + this.getContent() +
        "\nMessage Timestamp: " + this.getTimestamp());
    }
}