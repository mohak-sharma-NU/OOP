public class Main {
    
    public static void main(String[] args) {
        
        Printer p = new Printer();
        p.setBatteryLevel(90);

        SCanner s = new SCanner();
        s.setBatteryLevel(65);

        p.connect("connect");
        s.connect("connect");

        p.PowerOn();
        s.PowerOn();

        p.checkBattery();
        s.checkBattery();

        p.PowerOff();
        s.PowerOff();
    }
}
