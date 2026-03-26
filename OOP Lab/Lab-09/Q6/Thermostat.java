
import java.util.Scanner;

public class Thermostat extends Device{
    public int temperature=0;

    public void performAction(String action){
        if (action.equals("SET_TEMPERATURE")) {
            System.out.println("setting temperature");
            System.out.println("Enter temperature to set: ");
            Scanner in = new Scanner(System.in);
            int temp = in.nextInt();
            this.temperature = temp;
            System.out.println("Set Temperature to: "+this.temperature);
        } else if(action.equals("OFF")){
            System.out.println("Turning the thermostat off");
            temperature = 0;
        }else if(action.equals("BOOST")){
            System.out.println("Increased temperature of the thermostat by 5*C");
            this.temperature +=5;
        }else{
            System.out.println("INVALID ACTION(thermostat)");
        }
    } 
    
}
