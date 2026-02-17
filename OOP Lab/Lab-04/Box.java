import java.util.Scanner;

public class Box {

    Scanner input = new  Scanner(System.in);
    
        public int width;
        public int height;

        public void print(){
            System.out.println("Width: "+width+", Height: "+height);
        }

        public Box(int w,int h){
            this.width = w;
            this.height = h;
        }

        public Box(int h){
            this.height = h;
            System.out.println("Enter the Width: ");
            int w = input.nextInt();
            this.width = w;
        }

        public Box(){
            System.out.println("Enter the Height: ");
            int h = input.nextInt();
            this.height = h;

            System.out.println("Enter the Width: ");
            int w = input.nextInt();
            this.width = w;
        }

    public static void main(String[] args) {
        Box b1 =  new Box(10, 12);
        Box b2 = new Box(12);
        Box b3 = new Box();

        b1.print();
        b2.print();
        b3.print();
    }
}
