public class Notification {

    private final int notificationId;
    private int userId;
    private String message;
    private String type;          // INFO, ALERT, SYSTEM
    private String timestamp;
    private boolean isRead;

    private static int totalNotifications = 0;

    //   CONSTRUCTORS 

    public Notification() {
        this.notificationId = ++totalNotifications;
        this.userId = 0;
        this.message = "No Message";
        this.type = "INFO";
        this.timestamp = "NOT SET";
        this.isRead = false;
    }

    public Notification(int userId, String message,String type, String timestamp,boolean isRead) {
        this.notificationId = ++totalNotifications;
        this.userId = userId;
        this.message = message;
        this.type = type;
        this.timestamp = timestamp;
        this.isRead = isRead;
    }
    
    //   SETTERS 

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setRead(boolean read) {
        this.isRead = read;
    }

    //   GETTERS 

    public int getNotificationId() {
        return notificationId;
    }

    public int getUserId() {
        return userId;
    }

    public String getMessage() {
        return message;
    }

    public String getType() {
        return type;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public boolean isRead() {
        return isRead;
    }

    public static int getTotalNotifications() {
        return totalNotifications;
    }

    //   CLASS METHODS 

    public void sendNotification() {
        System.out.println("Notification sent to User ID: " + userId);
    }

    public void markAsRead() {
        this.isRead = true;
    }

    public void deleteNotification() {
        this.message = "DELETED";
    }

    public void displayNotificationDetails() {
        System.out.println("\nNotification ID: " + this.getNotificationId() +
        "\nNotification User ID: " + this.getUserId() +
        "\nNotification Message: " + this.getMessage() +
        "\nNotification Type: " + this.getType() +
        "\nNotification Timestamp: " + this.getTimestamp() +
        "\nNotification Read Status: " + this.isRead());
    }

    public static void main(String[] args) {
        
    }
}
