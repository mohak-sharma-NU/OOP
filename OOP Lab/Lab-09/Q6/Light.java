public class Light extends Device{
    public int brightness=0;
    public void performAction(String action){
        if (action.equals("ON")) {
            System.out.println("turning the lights on");
            brightness = 100;
        } else if(action.equals("OFF")){
            System.out.println("Turning the lights off");
            brightness = 0;
        }else if(action.equals("DIM")){
            System.out.println("Lowered brightnessof the lights to 50%");
            brightness = 50;
        }else{
            System.out.println("INVALID ACTION (lights)");
        }
    }   
}