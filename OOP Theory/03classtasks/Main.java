public class Main {
    
    public static void main(String[] args) {
        
        EmailNotification e = new EmailNotification();
        SMSNotification s = new SMSNotification();

        e.send();
        s.send();
    }
}
