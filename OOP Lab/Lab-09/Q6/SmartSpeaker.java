public class SmartSpeaker extends Device{
        public void performAction(String action){
        if (action.equals("PLAY")) {
            System.out.println("Playing Music");
        } else if(action.equals("STOP")){
            System.out.println("Stopping Music");
        }else if (action.equals("VOLUME_UP")) {
            System.out.println("Increasing volume by 10");
        }else if (action.equals("VOLUME_DOWN")) {
            System.out.println("Decreasing volume by 10");
        }else{
            System.out.println("INVALID ACTION(Smart Speaker)");
        }
    }
}
