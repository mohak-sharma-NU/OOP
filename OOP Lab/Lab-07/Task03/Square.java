public class Square extends Rectangle{
    
    public Square(double side){
        super(side, side);
    }

    public static void main(String[] args) {
        
        Rectangle r = new Rectangle(10, 12);
        Square s = new Square(20);

        r.printPerimeter();
        r.printArea();

        s.printPerimeter();
        s.printArea();
        
    }
}
