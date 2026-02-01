
import java.util.Scanner;

public class Elevator {

    private int currentFloor;
    private int minFloor;
    private int maxFloor;

    public void setMinFloor(int minfloor){
        minFloor = minfloor;
    }
    public void setMaxFloor(int maxfloor){
        maxFloor = maxfloor;
    }
    public int setCurrentFloor(int currentfloor){
        if (currentfloor>=minFloor&&currentfloor<=maxFloor) {
            currentFloor = currentfloor;
            return 1;
        }else{
            System.out.println("Failed to allocate current floor.\n");
            return 0;
        }
    }
    public int getcurrentFloor(){
        return currentFloor;
    }
    public int moveUp(){
        if(currentFloor==minFloor){
            System.out.println("Already at Top Floor");
            return 1;
        }else{
            currentFloor++;
            return 0;
        }
    }
    public int moveDown(){
        if(currentFloor==maxFloor){
            System.out.println("Already at Bottom Floor");
            return 1;
        }else{
            currentFloor--;
            return 0;
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Elevator e1 = new Elevator();
        System.out.println("Enter the bottom floor, top floor, Current Floor: ");
        e1.setMinFloor(input.nextInt());
        e1.setMaxFloor(input.nextInt());

        int x;
        String a;
        do{
            x = e1.setCurrentFloor(input.nextInt());
        }while(x==0);

        System.out.println("Enter wether you want to move up(u) or down(d).");

        
        do{ 
            a = input.next();
            if (a.equals("u")||a.equals("U")) {
                x = e1.moveUp();
            }else if (a.equals("d")||a.equals("D")) {
                x = e1.moveDown();
            }else{
                System.out.println("Please enter a valid (u or d) input.");
            }
        } while (x==0);
    }

}