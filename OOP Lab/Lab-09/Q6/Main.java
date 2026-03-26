public class Main {

    public static void main(String[] args) {
        Device D[] = new Device[4];

        D[0] = new Light();
        D[1]  = new Thermostat();
        D[2] = new SecurityCamera();
        D[3] = new SmartSpeaker();


        D[0].performAction("OFF");
        D[1].performAction("SET_TEMPERATURE");
        D[2].performAction("RECORD");
        D[3].performAction("PLAY");

    }
}
