public class SecurityCamera extends Device{
    public void performAction(String action){
        if (action.equals("RECORD")) {
            System.out.println("Recording");
        } else if(action.equals("STOP")){
            System.out.println("Stopping recording");
        }else if (action.equals("ALERT")) {
            System.out.println("Detected signs of movement");
        }else{
            System.out.println("INVALID ACTION(Security Cam)");
        }
    }
}
